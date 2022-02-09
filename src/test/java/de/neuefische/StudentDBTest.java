package de.neuefische;

import de.neuefische.interfaces.PhysikStudent;
import de.neuefische.interfaces.Student;
import de.neuefische.interfaces.StudentDB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class StudentDBTest {

    @Test
    void returnStudents() {
        //given
        PhysikStudent student1 = new PhysikStudent("Hans", "Peter", 5, 1);
        PhysikStudent student2 = new PhysikStudent("Max", "Meyer", 4, 2);
        //when
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        StudentDB studentDB = new StudentDB(students);
        //then
        System.out.println(studentDB.toString());
    }

}