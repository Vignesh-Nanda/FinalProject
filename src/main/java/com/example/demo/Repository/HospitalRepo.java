package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

}
