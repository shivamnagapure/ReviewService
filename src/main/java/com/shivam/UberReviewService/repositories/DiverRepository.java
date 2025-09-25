package com.shivam.UberReviewService.repositories;

import com.example.uberprojectentityservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiverRepository extends JpaRepository<Driver, Long> {
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
