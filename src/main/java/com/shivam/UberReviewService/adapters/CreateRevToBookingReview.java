package com.shivam.UberReviewService.adapters;

import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.dto.CreateReviewDto;

public interface CreateRevToBookingReview {

    BookingReview toBookingReview(CreateReviewDto createReviewDto);
}
