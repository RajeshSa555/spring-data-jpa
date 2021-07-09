package com.rajesh.jpa.springdatajpacourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajesh.jpa.springdatajpacourse.entity.Course;
import com.rajesh.jpa.springdatajpacourse.repo.CourseRepo;

@SpringBootTest
class CourseTests {

	@Autowired
	private CourseRepo repo;

	@Test
	public void getCourse() {
		List<Course> li = repo.findAll();
		System.out.println(li);
	}
}
