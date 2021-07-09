package com.rajesh.jpa.springdatajpacourse.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

	@Id
	@SequenceGenerator(name="teachersequ",sequenceName = "teachersequ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "teachersequ")
	private int teachId;
	private String firstname;
	private String lastname;
	
	
	/*
	 * @OneToMany (cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="Techae_id",referencedColumnName = "teachId") private
	 * List<Course> course;
	 */
}
