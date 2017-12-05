/*
 * Hector Mata
 * 11/02/2017
 */
package edu.umb.cs.cs410.hw02;

public class Intl extends StudentStatus{

    private float tuition;

    private static Intl object = null;
    private Intl() {

        tuition = 35000;
    }

    public static Intl getInstance() {

        if (object == null) {
            object = new Intl();
        }
        return object;

    }

    public float getTuition() {

        return tuition;

    }

    // public void setTution(float tution) {

        //this.tuition = tution;

    //}

}
