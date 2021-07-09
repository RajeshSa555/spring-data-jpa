package com.rajesh.jpa.springdatajpacourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajesh.jpa.springdatajpacourse.entity.Student;
import com.rajesh.jpa.springdatajpacourse.repo.StudentRepo;

@SpringBootTest
class StudentRepoMethods {

	@Autowired
	private StudentRepo repo;

	@Test
	public void getFirstName() {
		List<Student> li = repo.findByFirstname("rajesh");

		System.out.println(li);
	}

	@Test
	public void PrintgetStudentEmailAddress() {

		Student s2 = repo.getStudentEmailAddress("rajesh@gmail.com");
		System.out.println(s2.getFirstname());
	}

	@Test
	public void PrintgetStudentFirstnameEmailAddress() {

		String name = repo.getStudentFirstnameEmailAddress("rajesh@gmail.com");
		System.out.println(name);
	}

	@Test
	public void printGetStudentEmailAddressNative() {

		Student s3 = repo.getStudentEmailAddressNative("rajesh@gmail.com");
		System.out.println("student" + s3.getFirstname());
	}

	@Test
	public void printGetStudentEmailAddressNamedParam() {
		Student s4 = repo.getStudentEmailAddressNamedParam("rajesh@gmail.com");
		System.out.println("namedqiery" + "==============" + s4.getFirstname());
	}

	@Test
	public void printGetStudentUpdateData() {
	int i = repo.getStudentUpdateData("sangareddy", "rajesh@gmail.com");
		System.out.println("named" +i);
	}

}
