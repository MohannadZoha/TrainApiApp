package io.javabrains.springbootstarter.train.controller;




import io.javabrains.springbootstarter.train.domain.BookingReference;
import io.javabrains.springbootstarter.train.domain.Seat;
import io.javabrains.springbootstarter.train.services.BookingReferenceService;
import io.javabrains.springbootstarter.train.services.SeatService;
import io.javabrains.springbootstarter.train.domain.Train;
import io.javabrains.springbootstarter.train.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableAutoConfiguration
@RestController
public class TrainController {


    @Autowired
    private TrainService trainService;

    @Autowired
    private SeatService seatService;

    @Autowired
    private BookingReferenceService bookingReferenceService;


    @RequestMapping("/trains")
    public List<Train> getTrainInfo(){
        return trainService.getTrains();
    }
    @RequestMapping("/seats")
    public List<Seat> getSeat(){
        return seatService.getSeat();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/reserve")
    public void reserveTrain(@RequestBody Train train ){
        trainService.reserveTrain(train);
    }

    @RequestMapping("/bookingRef")
    public List<BookingReference> getBookingRef(){
        return bookingReferenceService.getBookingReferences();
    }

    }

