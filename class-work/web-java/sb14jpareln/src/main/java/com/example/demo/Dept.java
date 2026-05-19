package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="depts")
@ToString(exclude = "empList")
public class Dept {
	@Id
	private int deptno;
	private String dname;
	@OneToMany(mappedBy = "deptno") // fetch = FetchType.EAGER
	private List<Emp> empList;
}
