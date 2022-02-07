package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void toStrings() {
        Student student1 = new Student("Hans", "Peter", 5);
        String name = student1.toString();
        assertEquals("Student{firstName='Hans', lastName='Peter', semester=5}", name);
    }

    @Test
    void testLastName() {
        var student = new Student();
        student.setLastName("Uslu");
        assertEquals("Uslu", student.getLastName());
    }

    @Test
    void testFirstName() {
        var student = new Student();
        student.setFirstName("Samet");
        assertEquals("Samet", student.getFirstName());
    }

    @Test
    void testSemester() {
        var student = new Student();
        student.setSemester(5);
        assertEquals(5, student.getSemester());
    }

    @Test
    void testEquals() {
        var student = new Student("Hans", "peter", 3);
        var student2 = new Student("Peter", "Hans", 3);

        assertFalse(student.equals(student2));
    }

}


