package com.rajesh.jpa.springdatajpacourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajesh.jpa.springdatajpacourse.entity.Course;
import com.rajesh.jpa.springdatajpacourse.entity.Student;
import com.rajesh.jpa.springdatajpacourse.entity.Teacher;
import com.rajesh.jpa.springdatajpacourse.repo.CourseRepo;
import com.rajesh.jpa.springdatajpacourse.repo.TeacherRepo;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class TeacherTests {

	@Autowired
	private TeacherRepo repo;

	@Autowired
	private CourseRepo crepo;

	/*
	 * @Test public void getOneToMany() { Course c =
	 * Course.builder().title("aaa").credit(232).build(); Course c1 =
	 * Course.builder().title("aaa").credit(232).build();
	 * 
	 * List<Course> list = new ArrayList<Course>(); list.add(c); list.add(c1);
	 * Teacher t =
	 * Teacher.builder().firstname("rajesh").lastname("sanga").course(list).build();
	 * repo.save(t);
	 * 
	 * System.out.println(t); }
	 */

	/*
	 * @Test public void getManyToOne() { Teacher t =
	 * Teacher.builder().firstname("sdfsdf").lastname("sdfsd").build();
	 * 
	 * Course c = Course.builder().credit(34234).title("sdfsdf").teacher(t).build();
	 * System.out.println(c); crepo.save(c); }
	 */

	@Test
	public void getManyToMany() {
		log.error(" techer first");
		Teacher t = Teacher.builder().firstname("sdfs").lastname("sdfsd").build();
		log.error(" student second");
		Student s = Student.builder().firstname("rer").lastname("sds").emailid("radas2@gmail.com").build();

		log.error("course third");
		Course course = Course.builder().credit(2342).title("gjghj").teacher(t).build();
		log.error("save the ");
		course.addStudents(s);

		log.error("ok");
		crepo.save(course);
	}

}
