/*
 * Hector Mata
 * 11/02/2017
 */
package edu.umb.cs.cs410.hw02;

public class InState extends StudentStatus{

    private float tuition;

    private static InState object = null;
    private InState() {

        tuition = 1000;
    }

    public static InState getInstance() {

        if (object == null) {
            object = new InState();
        }
        return object;

    }

    public float getTuition() {

        return tuition;

    }

    // public void setTution(float tution) {

        //this.tuition = tuition;

    // }

}

