package com.shivam.UberReviewService.services;

import com.shivam.UberReviewService.models.Booking;
import com.shivam.UberReviewService.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    BookingRepository bookingRepository ;

    public BookingServiceImpl(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository ;
    }

    @Override
    public Booking findBookingById(Long id) {
        Optional<Booking> booking = bookingRepository.findById(id);

        return booking.get();
    }
}
