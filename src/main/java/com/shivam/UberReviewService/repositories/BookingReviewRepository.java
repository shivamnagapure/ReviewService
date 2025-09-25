package com.shivam.UberReviewService.repositories;

import com.example.uberprojectentityservice.models.BookingReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//We are using Spring Data JPA to communicate with database

/*
       Spring Data JPA provides "JpaRepository<Review , Long>" , methods of JpaRepository can only use for Review entity
       and Long is data type of primary key of Review entity/class
 */
@Repository
public interface BookingReviewRepository extends JpaRepository<BookingReview, Long> {

    BookingReview findBookingReviewById(Long id);
}
