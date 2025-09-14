package com.shivam.UberReviewService.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Booking extends BaseModel{

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus ;//By default, it creates column for Enum of type Ordinal .

    private Date startTime ;

    private Date endTime ;

    private Long totalDistance ;

    /*
        In a realistic model, every Booking is made with one Driver.
        So, booking table simply stores a driver_id column that points to the driver table.
        That way, we can fetch the driver info directly from the driver table — no need for a driver_bookings join table.

        to solve this we use mapped , which refers Owner class having foreign key
     */

/*
    Lazy Fetch (FetchType.LAZY)
    Default for: @OneToMany, @ManyToMany
    Means the related data is not loaded immediately.

    Eager Fetch (FetchType.EAGER)
    Default for: @ManyToOne, @OneToOne
    Means the related entity is always fetched along with the parent (via JOIN).
*/
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver ; //it stores Driver table primary key as foreign key in Booking table

    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passenger ;//it stores Passenger table primary key as foreign key in Booking table
}
