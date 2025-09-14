package com.shivam.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Passenger extends BaseModel{

    private String name ;

    @OneToMany(mappedBy = "passenger" )
    private List<Booking> bookings ; // 1 : m relationship
}
