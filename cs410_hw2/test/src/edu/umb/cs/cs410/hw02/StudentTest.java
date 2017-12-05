package edu.umb.cs.cs410.hw02;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class StudentTest {

    @Test
    public void student1() {

        Student s1 = Student.createInStateStudent("Hector Mata", 7);
        assertEquals(s1.getTuition(), 1000, 0);

    }

    @Test
    public void student2() {

        Student s2 = Student.createIntlStudent("Kelly Nichols", 22);
        assertEquals(s2.getTuition(), 35000, 0);
    }

    @Test
    public void student3() {

        Student s3 = Student.createOutStateStudent("Leah Math", 2);
        assertEquals(s1.getTuition(), 55000, 0);
    }



}
