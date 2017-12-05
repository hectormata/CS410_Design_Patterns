/*
 * Hector Mata
 * 11/02/2017
 */
package edu.umb.cs.cs410.hw02;

public abstract class StudentStatus {

    /* I left this block empty and set up a getTuition() method on
     * all the other codes InState.java, Intl.java, etc
     * The reason is because when compiling I kept getting a message saying that
     * the method was supposed to return String, int,int, status and I could not
     * figure out how to fix it since my student object had all thos for requiements
     * 
     */

    protected static float tuition;

    public StudentStatus() {

    }

    public float getTuition() {

        return tuition;
    }
}

