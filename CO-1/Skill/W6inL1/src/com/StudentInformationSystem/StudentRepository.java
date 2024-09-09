package com.StudentInformationSystem;

public interface StudentRepository {
    void save(Student student);
    Student find(String id);
}
