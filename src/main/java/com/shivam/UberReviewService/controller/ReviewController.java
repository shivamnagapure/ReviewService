package com.shivam.UberReviewService.controller;

import com.shivam.UberReviewService.adapters.CreateRevToBookingReview;
import com.shivam.UberReviewService.dto.CreateReviewDto;
import com.shivam.UberReviewService.dto.ReviewResponseDto;
import com.shivam.UberReviewService.models.BookingReview;
import com.shivam.UberReviewService.services.BookingReviewService;
import com.shivam.UberReviewService.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    CreateRevToBookingReview createRevToBookingReview ;
    BookingReviewService bookingReviewService ;

    public ReviewController(CreateRevToBookingReview createRevToBookingReview , BookingReviewService bookingReviewService){
        this.createRevToBookingReview = createRevToBookingReview ;
        this.bookingReviewService = bookingReviewService ;
    }

    @PostMapping
    public ResponseEntity<?> publishReview(@RequestBody CreateReviewDto createReviewDto){
        BookingReview toBookingReview = createRevToBookingReview.toBookingReview(createReviewDto);
        BookingReview bookingReview = bookingReviewService.saveBooking(toBookingReview);
        ReviewResponseDto reviewResponseDto = Response.bookingReviewResponse(bookingReview);
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewResponseDto);
    }
}
