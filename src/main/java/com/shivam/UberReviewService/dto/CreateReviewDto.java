package com.shivam.UberReviewService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateReviewDto {

    private Long bookingId ;
    private String content ;
    private Double rating ;

}
