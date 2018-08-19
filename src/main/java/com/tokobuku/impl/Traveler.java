package com.tokobuku.impl;

import com.tokobuku.common.Vehicle;

public class Traveler {

    private Vehicle car;
    private String origin;
    private String destination;

    public Traveler() {
        origin = "";
        destination = "";
    }

    public Traveler(Vehicle car123) {
        System.out.println("**** Constructor Traveler with parameter car123 is called ****");
        this.car = car123;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        System.out.println("**** Setter setCar with parameter car is called ****");
        this.car = car;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Traveler{" +
                "car=" + car +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public void showCar() {
        System.out.println(car);
    }

    public void startJourney() {
        car.move();
    }

}
