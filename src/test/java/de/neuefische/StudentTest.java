package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void toStrings() {
        PhysikStudent student1 = new PhysikStudent("Hans", "Peter", 5, 1);
        String name = student1.toString();
        assertEquals("Student{firstName='Hans', lastName='Peter', semester=5, id=1}", name);
    }

    @Test
    void testLastName() {
        var student = new PhysikStudent();
        student.setLastName("Uslu");
        assertEquals("Uslu", student.getLastName());
    }

    @Test
    void testFirstName() {
        var student = new PhysikStudent();
        student.setFirstName("Samet");
        assertEquals("Samet", student.getFirstName());
    }

    @Test
    void testSemester() {
        var student = new PhysikStudent();
        student.setSemester(5);
        assertEquals(5, student.getSemester());
    }

    @Test
    void testEquals() {
        var student = new PhysikStudent("Hans", "peter", 3, 1);
        var student2 = new PhysikStudent("Peter", "Hans", 3, 2);

        assertFalse(student.equals(student2));
    }

}


