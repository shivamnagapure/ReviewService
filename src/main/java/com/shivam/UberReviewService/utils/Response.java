package com.shivam.UberReviewService.utils;

import com.shivam.UberReviewService.dto.ReviewResponseDto;
import com.shivam.UberReviewService.models.BookingReview;

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
