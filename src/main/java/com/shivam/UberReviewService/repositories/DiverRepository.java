package com.shivam.UberReviewService.repositories;

import com.shivam.UberReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface DiverRepository extends JpaRepository<Driver , Long> {
  /*  //JPA Query Methods
    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber) ;

    //using Raw Sql query
    @Query(nativeQuery = true , value = "SELECT * FROM driver WHERE name = :Name")
    Optional<Driver> findByNameNative(String Name);

    //Using Hibernate query
    @Query("FROM Driver d WHERE d.name = :name AND d.licenseNumber = :licenseNumber")//d.column name same as Driver field name
    Optional<Driver> findByNameAndLicences(String name , String licenseNumber);*/


    List<Driver> findAllByIdIn(List<Long> ids);
}
