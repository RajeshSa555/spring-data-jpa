package com.rajesh.jpa.springdatajpacourse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajesh.jpa.springdatajpacourse.entity.CourseMaterial;

@Repository
public interface CourseMaterialRepo extends JpaRepository<CourseMaterial, Integer> {

}
