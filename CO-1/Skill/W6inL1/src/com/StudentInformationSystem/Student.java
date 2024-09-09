package com.StudentInformationSystem;

public class Student {
    private String id;
    private String name;

    // Constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
}
