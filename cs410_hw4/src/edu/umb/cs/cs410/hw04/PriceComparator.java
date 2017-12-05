package edu.umb.cs.cs410.hw04;
/*
 * Hector Mata
 * CS 410
 * Homework 4
 * 11/23/2017
 *
 */

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2) {

        return Integer.compare(car1.getPrice(), car2.getPrice());
    }
}
