package com.StudentInformationSystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentCreation() {
        Student student = new Student("1", "John Doe");
        assertEquals("1", student.getId());
        assertEquals("John Doe", student.getName());
    }
}