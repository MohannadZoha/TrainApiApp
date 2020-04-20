package io.javabrains.springbootstarter.train.services;


import io.javabrains.springbootstarter.train.domain.Seat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SeatService {

    private List<Seat> seat = new ArrayList<>(Arrays.asList(
            new Seat(1,2),
            new Seat(2,4)



    ));
    public List<Seat> getSeat(){
        return seat;
    }
}
