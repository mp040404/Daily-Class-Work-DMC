package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {

	@Id
	@Column(name = "patient_id")
	private int pid;
	@Column(name = "patient_name")
	private String pname;
	private String disease;
	private int age;
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@JsonIgnore
	private Doctor doctorid;
}
