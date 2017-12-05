package edu.umb.cs.cs410.hw01;

public class Calculator {

    // Multiplication
    public float multiply(float x, float y) {

        return x * y;
    }

    // Division with Warning "Can't divide by 0"
    public float divide(float x, float y) {

        if (y == 0) {
            throw new IllegalArguementException("Can't divide by 0");
        }

        return x / y;
    }

    // Extra function for addition
    public float sum(float x, float y) {

        return x + y;
    }

    // Extra function for Substraction
    public float minus(float x, float y) {

        return x - y;
    }
}
