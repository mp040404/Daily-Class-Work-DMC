package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = "empList")
@Entity
@Table(name = "meeting")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Meeting {

	@Id
	private int meetno;
	private String topic;
	private String venue;
	@ManyToMany(mappedBy = "meetingList")
	private List<Emp> empList;
	

}
