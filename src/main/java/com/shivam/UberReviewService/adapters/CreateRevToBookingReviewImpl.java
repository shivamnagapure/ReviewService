package com.shivam.UberReviewService.adapters;

import com.example.uberprojectentityservice.models.Booking;
import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.dto.CreateReviewDto;
import com.shivam.UberReviewService.services.BookingService;

import org.springframework.stereotype.Component;

@Component
public class CreateRevToBookingReviewImpl implements CreateRevToBookingReview{

    BookingService bookingService ;

    public CreateRevToBookingReviewImpl(BookingService bookingService){
        this.bookingService = bookingService ;
    }

    @Override
    public BookingReview toBookingReview(CreateReviewDto createReviewDto) {
        Booking booking = bookingService.findBookingById(createReviewDto.getBookingId());
        return BookingReview.builder()
                .booking(booking)
                .rating(createReviewDto.getRating())
                .content(createReviewDto.getContent())
                .build();
    }
}

