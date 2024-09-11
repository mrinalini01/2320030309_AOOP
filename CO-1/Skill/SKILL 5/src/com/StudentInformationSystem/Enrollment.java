package com.StudentInformationSystem;

import java.util.ArrayList;
import java.util.List;

public class Enrollment implements Enrollable {
    private List<Student> students = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        students.add(student);
    }

    // Additional methods
    public List<Student> getStudents() { return students; }
}