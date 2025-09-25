package com.shivam.UberReviewService.controller;

import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.adapters.CreateRevToBookingReview;
import com.shivam.UberReviewService.dto.CreateReviewDto;
import com.shivam.UberReviewService.dto.ReviewResponseDto;
import com.shivam.UberReviewService.services.BookingReviewService;
import com.shivam.UberReviewService.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<?>> getAllReviews(){
        List<ReviewResponseDto> reviews = bookingReviewService.getAllBookingReviews();
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<?> findReviewById(@PathVariable Long reviewId){
        BookingReview review = bookingReviewService.findReviewById(reviewId);
        ReviewResponseDto responseDto = Response.bookingReviewResponse(review);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseDto);
    }
}
