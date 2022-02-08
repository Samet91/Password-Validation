package de.neuefische.vererbung;

import java.util.Objects;

public class PhysikStudent extends Student {

    private String firstName;
    private String lastName;
    private int semester;
    private int id;
    private int course;
    private int module = 20;


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", semester=" + semester +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PhysikStudent student = (PhysikStudent) o;
        return semester == student.semester &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, semester);
    }

    public PhysikStudent(String firstName, String lastName, int semester, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.id = id;
    }

    public PhysikStudent() {

    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getSemester() {
        return semester;
    }


    public void setSemester(int semester) {
        this.semester = semester;
    }


    public int getCourse() {
        return course;
    }


    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int module() {
        return module;
    }
}

