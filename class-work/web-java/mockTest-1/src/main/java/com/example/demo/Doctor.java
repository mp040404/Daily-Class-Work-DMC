package com.example.demo;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Doctor {

	@Id
	@Column(name = "doctor_id")
	private int doctorid;
	@Column(name = "doctor_name")
	private String doctorname;
	@Column(name = "specialization")
	private String spe;
	@Column(name = "experience")
	private int expr;
	@OneToMany(mappedBy = "doctor_id",cascade = CascadeType.ALL)
	List<Patient> patientList;
	
}
