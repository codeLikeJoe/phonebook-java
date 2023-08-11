package com.Andriod;

public class EletricCar implements CarInterface, TestInterface {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EletricCar(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Car has started moving");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.name + " is moving at a speed of " + speed + " meters per second");
    }

    @Override
    public void stop(int time) {
        System.out.println(this.getName() + " stopped moving at " + time + " CAT");
    }
}
