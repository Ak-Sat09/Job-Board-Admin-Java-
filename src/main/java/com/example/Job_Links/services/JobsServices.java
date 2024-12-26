package com.example.Job_Links.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.example.Job_Links.entities.JobEntity;
import com.example.Job_Links.repositories.JobRepository;

@Service
public class JobsServices {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity saveJob(JobEntity job){
       return jobRepository.save(job);
    }

    public List<JobEntity> AllJobs(){
        return jobRepository.findAll();
    } 

     
        public void DeleteJob(Integer id) {
            if (!jobRepository.existsById(id)) {
                throw new RuntimeException("Job with ID " + id + " not found");
            }
            jobRepository.deleteById(id);
        }
    
    }
    

