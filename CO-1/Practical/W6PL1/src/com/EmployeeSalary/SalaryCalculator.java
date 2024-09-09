package com.EmployeeSalary;

public class SalaryCalculator {
    // Method to calculate salary based on role
    public double calculateSalary(Employee employee) {
        double baseSalary = 30000; // Base salary for all employees
        double salary = baseSalary;

        switch (employee.getRole().toLowerCase()) {
            case "developer":
                salary += 20000; // Additional salary for developers
                break;
            case "manager":
                salary += 30000; // Additional salary for managers
                break;
            case "intern":
                salary += 5000; // Additional salary for interns
                break;
            default:
                break;
        }

        return salary;
    }
}

