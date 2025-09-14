package com.shivam.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

/*
    @Entity : 1. tell JPA provider (Hibernate) to map class in database as table.
              2. All fields mapped to column of DataBase by default ;
    @Table : use to provides extra information about table

    JPA/Hibernate uses reflection and requires a no-arg constructor to instantiate entities before setting fields.
    If you don’t define any constructor in the class, Java provides one automatically.
    But if you define any other constructor (like @AllArgsConstructor),
    Java does not generate a default one → that’s when @NoArgsConstructor becomes necessary.

    @AllArgsConstructor : to create obj of builder constructor with all fields needed
    @NoArgsConstructor : if any other constructor is created then ,we must have to create no argument constructor
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    //cascade decides how operations applied on one entity should be propagated/affected to related entities .
    @OneToOne(cascade = {CascadeType.PERSIST , CascadeType.REMOVE} , fetch = FetchType.LAZY)
    private Booking booking ;

    @Column(nullable = false) //Ensures that the column must always have a value when inserting or updating a record.
    private String content ;

    @Column(nullable = false)
    private Double rating ;

}
