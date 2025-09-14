package com.shivam.UberReviewService.services;

import com.shivam.UberReviewService.models.Booking;
import com.shivam.UberReviewService.models.Driver;
import com.shivam.UberReviewService.models.Review;
import com.shivam.UberReviewService.repositories.BookingRepository;
import com.shivam.UberReviewService.repositories.DiverRepository;
import com.shivam.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository ;

    private BookingRepository bookingRepository ;

    private DiverRepository diverRepository ;

    public ReviewService(ReviewRepository reviewRepository , BookingRepository bookingRepository ,DiverRepository diverRepository){
        this.reviewRepository = reviewRepository ;
        this.bookingRepository = bookingRepository ;
        this.diverRepository = diverRepository ;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
/*      to make entry in database we have to use save method of JPARepository
        Review r = Review.builder()
                    .content("Booking Ride")
                    .rating(5.0)
                    .build();

        Booking booking = Booking.builder()
                .review(r)
                .build();

        //using cascade it will save it at run time in database
        //reviewRepository.save(r); // this code executes sql query
        bookingRepository.save(booking);

        // here we have to maintain the order of persistence(making an object’s state permanent by storing it in a database.)
        // to solve this problem we use cascade
*/
        List<Long> ids = Arrays.asList(1L,2L,4L) ;
        List<Driver> drivers = diverRepository.findAllByIdIn(ids);


        //List<Booking> bookings = bookingRepository.findAllByDriverIn(drivers);

        for(Driver driver : drivers){
           List<Booking> bookings = driver.getBookings();
            bookings.forEach(booking -> System.out.println(booking.getId()));
        }

    }
}
