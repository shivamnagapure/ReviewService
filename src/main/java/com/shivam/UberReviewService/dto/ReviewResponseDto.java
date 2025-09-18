package com.shivam.UberReviewService.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReviewResponseDto {

    private Long Id ;
    private Long bookingId ;
    private String content ;
    private Double rating ;

}
