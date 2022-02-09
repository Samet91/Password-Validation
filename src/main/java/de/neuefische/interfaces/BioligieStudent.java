package de.neuefische.interfaces;

import java.util.Objects;

public class BioligieStudent implements Student {

    private String firstName;
    private String lastName;
    private int semester;
    private int id;
    private int course;

    public BioligieStudent(String firstName, String lastName, int semester, int id, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.id = id;
        this.course = course;
    }

    public BioligieStudent() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BioligieStudent that = (BioligieStudent) o;
        return semester == that.semester &&
                id == that.id && course == that.course &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, semester, id, course);
    }

    @Override
    public String toString() {
        return "BioligioStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", semester=" + semester +
                ", id=" + id +
                ", course=" + course +
                '}';
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
