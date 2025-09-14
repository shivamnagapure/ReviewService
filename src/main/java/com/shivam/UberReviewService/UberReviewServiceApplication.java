package com.shivam.UberReviewService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/*
	 @EnableJpaAuditing : it tells Spring Data JPA to automatically fill the auditing fields like @CreatedAt , @CreatedBy ..
 */
@SpringBootApplication
@EnableJpaAuditing
public class UberReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberReviewServiceApplication.class, args);
	}

}
