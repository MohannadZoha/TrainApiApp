package io.javabrains.springbootstarter.train.domain;


import java.lang.reflect.Array;

public class Train {
    private String train_id;
    private String seats;
    private int coach;
    private int seat;






    public int getCoach() {
        return coach;
    }

    public void setCoach(int coach) {
        this.coach = coach;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Train() {

    }

    public Train(String train_id, String seats, int coach, int seat) {
        super();
        this.train_id = train_id;
        this.seats = seats;
        this.coach = coach;
        this.seat= seat;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
