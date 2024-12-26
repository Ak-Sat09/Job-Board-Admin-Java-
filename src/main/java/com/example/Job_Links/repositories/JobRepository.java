package com.example.Job_Links.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.example.Job_Links.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity , Integer>{

  
}
