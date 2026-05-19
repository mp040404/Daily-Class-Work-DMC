package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="depts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept {

	@Id
	private int deptno;
	private String dname;
	
	
}
