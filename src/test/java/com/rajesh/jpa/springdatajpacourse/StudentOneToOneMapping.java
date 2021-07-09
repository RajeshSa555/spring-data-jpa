package com.rajesh.jpa.springdatajpacourse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rajesh.jpa.springdatajpacourse.entity.Course;
import com.rajesh.jpa.springdatajpacourse.entity.CourseMaterial;
import com.rajesh.jpa.springdatajpacourse.repo.CourseMaterialRepo;
import com.rajesh.jpa.springdatajpacourse.repo.CourseRepo;

import lombok.ToString;

@SpringBootTest

class StudentOneToOneMapping {

	@Autowired
	private CourseMaterialRepo repo;

	@Test
	public void saveTheCourseAndCoursematerial() {
		Course c = Course.builder().title("java").credit(121).build();

		CourseMaterial cm = CourseMaterial.builder().url("rajesh:9090").course(c).build();

		repo.save(cm);
	}

	@Test
	public void printAllData() {
		List<CourseMaterial> cu = repo.findAll();
		System.out.println(cu);
	}

}
