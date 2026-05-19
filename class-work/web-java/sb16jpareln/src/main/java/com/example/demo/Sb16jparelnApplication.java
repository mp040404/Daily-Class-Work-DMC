package com.example.demo;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class Sb16jparelnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sb16jparelnApplication.class, args);
	}
	
	@Autowired
	private EmpDao empDao;
	
	@Autowired
	private MeetingDao meetingDao;
	
	@Transactional
	public void run(String... args) throws Exception {
		/*
		Optional<Emp> oe = empDao.findById(3);
		if(oe.isPresent()) {
			Emp e =  oe.get();
			System.out.println("Found : "+e);
			for (Meeting m : e.getMeetingList()) {
				System.out.println(" --> " + m );
			}
		}else
		{
			System.out.println("Emp not Found");
		}
		*/
		
		Optional<Meeting> om = meetingDao.findById(100);
		if(om.isPresent()) {
			Meeting m = om.get();
			System.out.println("Found : " + m);
			for (Emp e : m.getEmpList()) {
				System.out.println(e);
			}
		}
	}

}
