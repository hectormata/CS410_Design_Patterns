package edu.umb.cs.cs410.hw04;
/*
 * Hector Mata
 * CS 410
 * Homework 4
 * 11/23/2017
 *
 */

public class Car {

    private int year;
    private int price;
    private int mileage;

    public Car(int year, int price, int mileage) {

        this.year = year;
        this.price = price;
        this.mileage = mileage;

    }

    public int getYear() {
        return this.year;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMileage() {
        return this.mileage;
    }



}
