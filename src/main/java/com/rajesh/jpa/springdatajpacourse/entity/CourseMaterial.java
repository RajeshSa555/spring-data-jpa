package com.rajesh.jpa.springdatajpacourse.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@ToString(exclude = "course")
public class CourseMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencematerial")
	@SequenceGenerator(name = "sequencematerial", sequenceName = "sequencematerial", allocationSize = 0)
	private int courseMaterialId;
	private String url;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;
}
