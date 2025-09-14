package com.shivam.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PassengerReview extends Review {

    @Column(nullable = false)
    private String passengerReviewContent ;

    @Column(nullable = false)
    private Double passengerRating ;

}
