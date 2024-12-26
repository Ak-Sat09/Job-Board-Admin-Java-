package com.example.Job_Links.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.Job_Links.entities.JobEntity; 
import com.example.Job_Links.services.JobsServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 


@RestController
public class JobController {

    @Autowired
    private JobsServices jobsServices;
    // @Autowired
    // private JobRepository jobRepository;

    @PostMapping("add")
    public ResponseEntity<JobEntity> AddaNewJob(@RequestBody JobEntity job) {
        JobEntity savedJob = jobsServices.saveJob(job);
        return ResponseEntity.ok(savedJob);
    }
    

    @GetMapping("/jobs")
    public ResponseEntity<List<JobEntity>> GetAllJobs() {
       List<JobEntity> jobs = jobsServices.AllJobs();
       return ResponseEntity.ok(jobs);
    }
 
    @DeleteMapping("/delete/{id}")
public ResponseEntity<String> DeleteJobById(@PathVariable Integer id) {
    try {
        jobsServices.DeleteJob(id);
        return ResponseEntity.ok("Job with ID " + id + " was deleted successfully");
    } catch (RuntimeException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}

    
    
}
