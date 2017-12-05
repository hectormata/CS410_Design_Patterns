package edu.umb.cs.cs410.hw01;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void multiply3By4() {

        Calculator cut = new Calculator();
        float expected = 12;
        float actual = cut.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void multiply10By10() {

        Calculator cut = new Calculator();
        float expected = 100;
        float actual = cut.multiply(10, 10);
        assertThat(actual, is(expected));
    }

    @Test
    public void divide3By2() {

        Calculator cut = new Calculator();
        float expected = 1.5f;
        float actual = cut.divide(3, 2);
        assertThat(actual, is(expected));
    }

    @Test(expected=illegalArguementException.class)
    public void divide5By0() {

        Calculator cut = new Calculator();
        cut.divide(5, 0);

    }

    @Test
    public void divide20By8() {

        Calculator cut = new Calculator();
        float expected = 2.5f;
        float actual = cut.divide(20, 8);
        assertThat(actual, is(expected));
    }

    @Test
    public void sum10By30() {

        Calculator cut = new Calculator();
        float expected = 40;
        float actual = cut.sum(10, 30);
        assertThat(actual, is(expected));

    }

    @Test
    public void  sum93By94() {

        Calculator cut = new Calculator();
        float expected = 187;
        float actual = cut.sum(93, 94);
        assertThat(actual, is(expected));

    }

    @Test
    public void minus30By10() {

        Calculator cut = new Calculator();
        float expected = 20;
        float actual = cut.minus(30, 10);
        assertThat(actual, is(expected));

    }

    @Test
    public void minus75By33() {

        Calculator cut = new Calculator();
        float expected = 42;
        float actual = cut.minus(75, 33);
        assertThat(actual, is(expected));

    }


}
