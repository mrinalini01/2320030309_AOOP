package com.StudentInformationSystem;

public class OnlineCourse extends Course {
    private String url;

    // Constructor
    public OnlineCourse(String courseId, String courseName, String url) {
        super(courseId, courseName);
        this.url = url;
    }

    // Getter
    public String getUrl() { return url; }
}
