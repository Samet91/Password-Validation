package de.neuefische.interfaces;

import java.util.ArrayList;

public class StudentDB {

    private ArrayList<Student> students;


    public StudentDB(ArrayList<Student> arr) {
        this.students = arr;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public ArrayList<Student> list() {

        return students;
    }


    public void setArr(ArrayList<Student> arr) {

        this.students = arr;
    }
}