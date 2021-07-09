package com.rajesh.jpa.springdatajpacourse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajesh.jpa.springdatajpacourse.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
