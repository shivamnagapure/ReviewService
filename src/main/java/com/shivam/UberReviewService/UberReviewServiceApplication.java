package com.shivam.UberReviewService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/*
	 @EnableJpaAuditing : it tells Spring Data JPA to automatically fill the auditing fields like @CreatedAt , @CreatedBy ..
	 @EntityScan defaults to scan The package of your main application class , Sub-packages under it
      You need to explicitly tell Spring Boot where to find the entities.
 */
@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = "com.example.uberprojectentityservice.models")
public class UberReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberReviewServiceApplication.class, args);
	}

}
