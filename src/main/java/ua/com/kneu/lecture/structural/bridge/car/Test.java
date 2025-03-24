package ua.com.kneu.lecture.structural.bridge.car;

import ua.com.kneu.lecture.structural.bridge.maker.Seat;

public class Test {

    public static void main(String[] args) {

        Car seatForSport = new Sport(new Seat());
        seatForSport.details();

    }

}
