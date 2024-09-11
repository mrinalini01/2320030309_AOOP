package com.StudentInformationSystem;

import java.util.ArrayList;
import java.util.List;

class DatabaseStudentRepository implements StudentRepository {
    private List<Student> database = new ArrayList<>();

    @Override
    public void save(Student student) {
        database.add(student);
    }

    @Override
    public Student find(String id) {
        for (Student student : database) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}