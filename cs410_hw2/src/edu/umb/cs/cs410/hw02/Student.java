/*
 * Hector Mata
 * 11/02/2017
 */
package edu.umb.cs.cs410.hw02;

public class Student {

    private float tuition;
    private String name;
    private int yrResidence;
    private int i20;
    private StudentStatus status;

    private Student(String name, int yrResidence, int i20, StudentStatus status) {

        this.name        = name;
        this.yrResidence = yrResidence;
        this.i20         = i20;
        this.tuition     = tuition;
        this.status      = status;

    }

    public static Student createInstateStudent(String name, int yrResidence) {

            return new Student(name, yrResidence, 0, InState.getInstance());

    }

    public static Student createOutstateStudent(String name, int yrResidence) {

        return (new Student(name, yrResidence, 0, OutState.getInstance()));

    }

    public static Student createIntlStudent(String name, int i20) {

        return new Student(name, 0, i20, Intl.getInstance());

    }

    public void setStatus (StudentStatus status) {
        this.status = status;
    }

    public float getTuition() {

        return status.getTuition();

    }

    /*
    public void setStatus(InState status) {

        this.status = status;
        tuition = status.getTuition();

    }

    public void setStatus(OutState status) {

        this.status = status;
        tuition = status.getTuition();

    }

    public void setStatus(Intl status) {

        this.status = status;
        tuition = status.getTuition();

    }
     */

}




