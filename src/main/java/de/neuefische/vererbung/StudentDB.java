package de.neuefische.vererbung;

import java.util.Arrays;

public class StudentDB {

    private Student students[];


    public StudentDB(Student[] arr) {
        this.students = arr;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student[] list() {
        return students;
    }

    public Student[] getArr() {
        return students;
    }

    public void setArr(Student[] arr) {
        this.students = arr;
    }
}