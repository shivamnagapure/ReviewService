package com.shivam.UberReviewService;

import com.shivam.UberReviewService.controller.ReviewController;
import com.shivam.UberReviewService.services.BookingReviewService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//Automatically creates mock objects for fields annotated with @Mock
//and inject mocks into fields annotated with @InjectMocks
@ExtendWith(MockitoExtension.class)
public class ReviewControllerTest {

    @InjectMocks
    private ReviewController reviewController ;

    @Mock
    private BookingReviewService bookingReviewService ;



}
