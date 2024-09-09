package com.StudentInformationSystem;

public class Course {
    private String courseId;
    private String courseName;

    // Constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters and Setters
    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
}
