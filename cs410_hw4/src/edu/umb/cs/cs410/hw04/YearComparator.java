package edu.umb.cs.cs410.hw04;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2) {

        return Integer.compare(car1.getYear(), car2.getYear());
    }
}
