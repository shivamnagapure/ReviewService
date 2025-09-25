package com.shivam.UberReviewService.services;

import com.example.uberprojectentityservice.models.BookingReview;
import com.shivam.UberReviewService.dto.ReviewResponseDto;
import com.shivam.UberReviewService.repositories.BookingReviewRepository;
import com.shivam.UberReviewService.utils.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingReviewServiceImpl implements BookingReviewService{

    BookingReviewRepository bookingReviewRepository ;

    public BookingReviewServiceImpl(BookingReviewRepository bookingReviewRepository){
        this.bookingReviewRepository = bookingReviewRepository;
    }

    @Override
    public BookingReview saveBooking(BookingReview bookingReview){
        return bookingReviewRepository.save(bookingReview);
    }

    @Override
    public List<ReviewResponseDto> getAllBookingReviews(){
        return bookingReviewRepository.findAll().stream()
                .map(Response::bookingReviewResponse)
                .toList();
    }

    @Override
    public BookingReview findReviewById(Long id){
        return bookingReviewRepository.findBookingReviewById(id);
    }
}
