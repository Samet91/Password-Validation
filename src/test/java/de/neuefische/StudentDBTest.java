package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void returnStudents() {
        //given
        Student student1 = new Student("Hans", "Peter", 5, 1);
        //when
        Student[] students = {student1};
        StudentDB studentDB = new StudentDB(students);
        //then
        System.out.println(studentDB.toString());
    }

}