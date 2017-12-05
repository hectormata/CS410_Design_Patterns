/*
 * Hector Mata
 * 11/02/2017
 */
package edu.umb.cs.cs410.hw02;

public class OutState extends StudentStatus {

    private float tuition;

    private static OutState object = null;
    private OutState() {

        tuition = 55000;
    }

    public static OutState getInstance() {

        if (object == null) {
            object = new OutState();
        }
        return object;

    }

    public float getTuition() {

        return tuition;

    }

    //public void setTution(float tution) {

        //this.tuition = tuition;

    //}

}


