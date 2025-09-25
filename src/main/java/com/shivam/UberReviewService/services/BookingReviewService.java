package com.shivam.UberReviewService.services;

import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.dto.ReviewResponseDto;

import java.util.List;

public interface BookingReviewService {

    BookingReview saveBooking(BookingReview bookingReview);

    List<ReviewResponseDto> getAllBookingReviews() ;

    BookingReview findReviewById(Long id);

}
