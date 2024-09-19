package com.courseManagementSystem;

public class Course implements Comparable<Course>, Cloneable {
    private String courseName;
    private int creditHours;

    public Course(String courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    @Override
    public int compareTo(Course other) {
        return this.courseName.compareTo(other.courseName);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Credit Hours: " + creditHours;
    }
}
