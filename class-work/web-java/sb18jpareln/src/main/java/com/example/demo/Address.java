package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = "emp")
@Entity
@Table(name = "addr")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	@Id
	private int empno;
	private String tal;
	private String dist;
	@OneToOne(mappedBy = "addr")
	private Emp emp;

}
