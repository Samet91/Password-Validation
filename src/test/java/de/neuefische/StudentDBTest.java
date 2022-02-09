package de.neuefische;

import de.neuefische.interfaces.BioligieStudent;
import de.neuefische.interfaces.PhysikStudent;
import de.neuefische.interfaces.Student;
import de.neuefische.interfaces.StudentDB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StudentDBTest {

    @Test
    void returnPhysikStudents() {
        //given
        PhysikStudent student1 = new PhysikStudent("Hans", "Peter", 5, 1);
        PhysikStudent student2 = new PhysikStudent("Max", "Meyer", 4, 2);
        ArrayList<Student> students = new ArrayList<>();

        //when
        students.add(student1);
        students.add(student2);
        StudentDB studentDB = new StudentDB(students);

        //then
        System.out.println(studentDB.toString());
    }

    @Test
    void returnBioStudents() {
        //given
        BioligieStudent student1 = new BioligieStudent("Hans", "Peter", 5, 1,10);
        BioligieStudent student2 = new BioligieStudent("Max", "Meyer", 4, 2,10);
        //when
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        StudentDB studentDB = new StudentDB(students);
        //then
        System.out.println(studentDB.toString());
    }

}