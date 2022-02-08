package de.neuefische;

import org.junit.jupiter.api.Test;

class StudentDBTest {

    @Test
    void returnStudents() {
        //given
        PhysikStudent student1 = new PhysikStudent("Hans", "Peter", 5, 1);
        PhysikStudent student2 = new PhysikStudent("Max", "Meyer", 4, 2);
        //when
        PhysikStudent[] students = {student1, student2};
        StudentDB studentDB = new StudentDB(students);
        //then
        System.out.println(studentDB.toString());
    }

}