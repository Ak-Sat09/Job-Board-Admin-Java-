package com.example.Job_Links.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   
    private String companyName; // change to camelCase
    private String role;        // change to camelCase
    private String position;    // change to camelCase
    private LocalDate lastDate; // change to camelCase
    private String location;    // change to camelCase
    private int experience;
    private String applyLink;   // change to camelCase
    
}
