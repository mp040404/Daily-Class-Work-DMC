package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingDao extends JpaRepository<Meeting, Integer> {

}
