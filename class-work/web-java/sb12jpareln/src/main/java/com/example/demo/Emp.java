package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emps")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {

	@Id
	private int empno;
	private String ename;
	private Integer mgr;
	@ManyToOne
	@JoinColumn(name="deptno")
	private Dept dept;
}
