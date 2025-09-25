package com.shivam.UberReviewService.utils;

import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.dto.ReviewResponseDto;

public class Response {

    public static ReviewResponseDto bookingReviewResponse(BookingReview bookingReview){
        return ReviewResponseDto.builder()
                .Id(bookingReview.getId())
                .bookingId(bookingReview.getBooking().getId())
                .content(bookingReview.getContent())
                .rating(bookingReview.getRating())
                .build();
    }
}
