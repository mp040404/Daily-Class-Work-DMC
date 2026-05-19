package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = "addr")
@Entity
@Table(name = "emps")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emp {

	@Id
	private int empno;
	private String ename;
	private Integer mgr;
	private Integer deptno;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Address addr;
}
