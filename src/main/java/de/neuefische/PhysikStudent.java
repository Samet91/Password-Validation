package de.neuefische;

import java.util.Objects;

public class PhysikStudent implements Student {

    private String firstName;
    private String lastName;
    private int semester;
    private int id;
    private int course;


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

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getSemester() {
        return semester;
    }

    @Override
    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public int getCourse() {
        return course;
    }

    @Override
    public void setCourse(int course) {
        this.course = course;
    }
}

