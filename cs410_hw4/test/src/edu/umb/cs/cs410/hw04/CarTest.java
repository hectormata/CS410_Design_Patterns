package edu.umb.cs.cs410.hw04;
/*
 * Hector Mata
 * CS 410
 * Homework 4
 * 11/23/2017
 *
 *
 */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class CarTest {

    /*
     * Car test to sort the car list from oldest to newest car
     *
     */
    @Test
    public void CarTest1() {

        // Car c1 = new Car(2005, 2200, 20);
        // Car c2 = new Car(2006, 2000, 26);
        // Car c3 = new Car(1201, 2000, 12);

        ArrayList<Car> car1 = new ArrayList<Car>();

        // Honda Accord 2003, 5,500, 123,353
        car1.add(new Car(2003, 5500, 123353));
        // Honda Accord 2005, 9,000  181,520
        car1.add(new Car(2005, 9000, 181520));
        // Audi S4 2014, ,45,000, 16,000
        car1.add(new Car(2014, 45000, 16000));

        /*
        Collections.sort(car1, new YearComparator());

        assertThat(c3.equals(car1.remove(0)), CoreMatchers.is(true));
        assertThat(c2.equals(car1.remove(0)), CoreMatchers.is(true));
        assertThat(c1.equals(car1.remove(0)), CoreMatchers.is(true));
        //Collections.sort(car1, new MileageComparator());
        //assertThat(c2, 0, );

        */

        Collections.sort(car1, new YearComparator());
        int calulation1 = car1.get(0).getYear();
        int match1 = 2003;
        assertThat(calulation1, is(match1));

        Collections.sort(car1, new YearComparator());
        int calulation2 = car1.get(1).getYear();
        int match2 = 2005;
        assertThat(calulation2, is(match2));

        Collections.sort(car1, new YearComparator());
        int calulation3 = car1.get(2).getYear();
        int match3 = 2014;
        assertThat(calulation3, is(match3));

    }

    /*
     * Car test to sort the car list from cheapeast to most expensive
     *
     */
    @Test
    public void CarTest2() {

        // Car c1 = new Car(2005, 2200, 20);
        // Car c2 = new Car(2006, 2000, 26);
        ArrayList<Car> car2 = new ArrayList<Car>();

        // Honda Accord 2003, 5,500, 123,353
        car2.add(new Car(2003, 5500, 123353));
        // Honda Accord 2005, 9,000  181,520
        car2.add(new Car(2005, 9000, 181520));
        // Audi S4 2014, ,45,000, 16,000
        car2.add(new Car(2014, 45000, 16000));

        //Collections.sort(car1, new MileageComparator());
        //assertThat(c2, 0, );

        Collections.sort(car2, new PriceComparator());
        int calulation1 = car2.get(0).getPrice();
        int match1 = 5500;
        assertThat(calulation1, is(match1));

        Collections.sort(car2, new PriceComparator());
        int calulation2 = car2.get(1).getPrice();
        int match2 = 9000;
        assertThat(calulation2, is(match2));

        Collections.sort(car2, new PriceComparator());
        int calulation3 = car2.get(2).getPrice();
        int match3 = 45000;
        assertThat(calulation3, is(match3));


    }

    /*
     * Car test to sort the cars list from lowest miles to highest miles
     *
     */
    @Test
    public void CarTest3() {

        // Car c1 = new Car(2005, 2200, 20);
        // Car c2 = new Car(2006, 2000, 26);
        ArrayList<Car> car3 = new ArrayList<Car>();

        // Honda Accord 2003, 5,500, 123,353
        car3.add(new Car(2003, 5500, 123353));
        // Honda Accord 2005, 9,000  181,520
        car3.add(new Car(2005, 9000, 181520));
        // Audi S4 2014, ,45,000, 16,000
        car3.add(new Car(2014, 45000, 16000));

        //Collections.sort(car1, new MileageComparator());
        //assertThat(c2, 0, );

        Collections.sort(car3, new MileageComparator());
        int calulation1 = car3.get(0).getMileage();
        int match1 = 16000;
        assertThat(calulation1, is(match1));

        Collections.sort(car3, new MileageComparator());
        int calulation2 = car3.get(1).getMileage();
        int match2 = 123353;
        assertThat(calulation2, is(match2));

        Collections.sort(car3, new MileageComparator());
        int calulation3 = car3.get(2).getMileage();
        int match3 = 181520;
        assertThat(calulation3, is(match3));
    }

}
