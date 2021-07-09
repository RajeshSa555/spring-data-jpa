package com.rajesh.jpa.springdatajpacourse.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

	@Id
	@SequenceGenerator(name = "sequencecourse", sequenceName = "sequencecourse", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencecourse")
	private int courseId;
	private String title;
	private int credit;

	@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "techae_id", referencedColumnName = "teachId")
	private Teacher teacher;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course_app", joinColumns = @JoinColumn(name = "course_Id", referencedColumnName = "courseId"), inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))
	private List<Student> students;

	public void addStudents(Student student) {
		if (students == null)
			students = new ArrayList<>();
		students.add(student);
	}

}
