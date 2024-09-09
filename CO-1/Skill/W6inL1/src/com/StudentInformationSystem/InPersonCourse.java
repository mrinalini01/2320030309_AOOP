package com.StudentInformationSystem;

public class InPersonCourse extends Course {
    private String roomNumber;

    // Constructor
    public InPersonCourse(String courseId, String courseName, String roomNumber) {
        super(courseId, courseName);
        this.roomNumber = roomNumber;
    }

    // Getter
    public String getRoomNumber() { return roomNumber; }
}
