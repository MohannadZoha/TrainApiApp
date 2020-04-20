package io.javabrains.springbootstarter.train.services;


import io.javabrains.springbootstarter.train.domain.BookingReference;
import io.javabrains.springbootstarter.train.domain.Seat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class BookingReferenceService {


    private List<BookingReference> bookingReferences = new ArrayList<>(Arrays.asList(
            new BookingReference("5c8770cd-aaa6-4fcd-9481-beb7be1f52d2")


    ));
public  List <BookingReference> getBookingReferences(){
    return  bookingReferences;
}

}
