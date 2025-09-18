package com.shivam.UberReviewService.services;

import com.shivam.UberReviewService.models.BookingReview;
import com.shivam.UberReviewService.repositories.BookingRepository;
import com.shivam.UberReviewService.repositories.BookingReviewRepository;
import org.springframework.stereotype.Service;

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
}
