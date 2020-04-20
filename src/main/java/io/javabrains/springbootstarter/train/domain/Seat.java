package io.javabrains.springbootstarter.train.domain;



public class Seat {
    private int coach;
    private int seat;

    public Seat(int coach, int seat) {
        super();
        this.coach = coach;
        this.seat = seat;
    }

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
}
