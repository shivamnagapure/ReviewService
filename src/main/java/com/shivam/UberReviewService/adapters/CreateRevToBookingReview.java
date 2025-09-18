package com.shivam.UberReviewService.adapters;

import com.shivam.UberReviewService.dto.CreateReviewDto;
import com.shivam.UberReviewService.models.BookingReview;

public interface CreateRevToBookingReview {

    BookingReview toBookingReview(CreateReviewDto createReviewDto);
}
