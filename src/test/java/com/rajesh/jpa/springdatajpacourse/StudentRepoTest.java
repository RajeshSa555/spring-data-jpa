package com.rajesh.jpa.springdatajpacourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajesh.jpa.springdatajpacourse.entity.Guardian;
import com.rajesh.jpa.springdatajpacourse.entity.Student;
import com.rajesh.jpa.springdatajpacourse.repo.StudentRepo;

@SpringBootTest
class StudentRepoTest {

	@Autowired
	private StudentRepo repo;

	//@Test
	public void getStudentTest() {
		Student s = Student.builder().emailid("naidurajesh3@gmail.com").firstname("rajesh")
				// .guardianEmail("rajeshfu@gamil.com").guardianMobile("353453453").guardianName("naidu")
				.lastname("naidu").build();

		repo.save(s);
	}

	@Test
	public void getEmbeddedValue() {
		Guardian guardian = Guardian.builder().name("rajeshg").mobile("3453453").email("raj@gmail.com").build();

		Student s1 = Student.builder().emailid("rajesh3@gmail.com").firstname("rajesh").lastname("naidu")
				.guardian(guardian).build();

		repo.save(s1);
	}

	@Test
	public void printAllStudent() {
		List<Student> list = repo.findAll();

		System.out.println(list);
	}

	@Test
	public void printFindId() {
		Student ss = repo.findById(1).get();
		System.out.println(ss);
	}
}
