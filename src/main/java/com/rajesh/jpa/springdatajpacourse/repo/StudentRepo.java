package com.rajesh.jpa.springdatajpacourse.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.jpa.springdatajpacourse.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student> findByFirstname(String firstname);

	@Query("SELECT s FROM Student s WHERE s.emailid=?1")
	Student getStudentEmailAddress(String emailid);

	@Query("SELECT s.firstname FROM Student s WHERE s.emailid=?1")
	String getStudentFirstnameEmailAddress(String emailid);

	@Query(value = "SELECT * FROM tbl_student s WHERE s.email_address=?1", nativeQuery = true)
	Student getStudentEmailAddressNative(String emailid);

	@Query(value = "SELECT * FROM tbl_student s WHERE s.email_address=:emailid", nativeQuery = true)
	Student getStudentEmailAddressNamedParam(@Param("emailid") String emailid);

	@Modifying
	@Transactional
	@Query(value = "UPDATE tbl_student SET firstname=?1 WHERE email_address=?2", nativeQuery = true)
	int getStudentUpdateData(String name, String email);
}
