package com.shivam.UberReviewService.repositories;

import com.shivam.UberReviewService.models.Booking;
import com.shivam.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking , Long> {
    //when we use Lazy fetch mode and try to fetch data from other table after (session close) or get response it will throw error
    List<Booking> findByIdIn(List<Long> ids);

    List<Booking> findAllByDriverIn(List<Driver> drivers);

    @Query("SELECT b FROM Booking b JOIN FETCH b.driver WHERE b.id IN :ids ")
    List<Booking> findByIdInWithDriver(@Param("ids") List<Long> ids);
}
