package io.javabrains.springbootstarter.train.services;


import io.javabrains.springbootstarter.train.domain.Train;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TrainService {

    private List<Train> trains = new ArrayList<>(Arrays.asList(
            new Train("express_2000", "some seat", 1, 2),
            new Train("express_2001", "another seat", 2, 4)



    ));
    public List<Train> getTrains(){
        return trains;
    }
    public void reserveTrain(Train train){
        trains.add(train);
    }
}
