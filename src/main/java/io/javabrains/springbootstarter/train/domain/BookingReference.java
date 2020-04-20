package io.javabrains.springbootstarter.train.domain;

import java.util.UUID;

public class BookingReference {
    private String bookingRef;


    public BookingReference(){


    }



    public BookingReference(String bookingRef) {
        super();
        this.bookingRef = bookingRef;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }
}
