package com.example.Job_Links;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobLinksApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobLinksApplication.class, args);
	}

}
