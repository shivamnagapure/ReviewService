package com.shivam.UberReviewService.repositories;

import com.shivam.UberReviewService.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//We are using Spring Data JPA to communicate with database

/*
       Spring Data JPA provides "JpaRepository<Review , Long>" , methods of JpaRepository can only use for Review entity
       and Long is data type of primary key of Review entity/class
 */
@Repository
public interface ReviewRepository extends JpaRepository<Review , Long> {

}
