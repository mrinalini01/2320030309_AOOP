package com.EmployeeSalary;

public class Employee {
    private String name;
    private String role;

    // Constructor
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
