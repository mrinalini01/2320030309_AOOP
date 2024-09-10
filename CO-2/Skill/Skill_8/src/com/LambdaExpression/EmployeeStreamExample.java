package com.LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000),
            new Employee("Jane", 60000),
            new Employee("Jack", 55000),
            new Employee("Jill", 70000),
            new Employee("Jerry", 65000),
            new Employee("Jim", 75000),
            new Employee("Joe", 80000),
            new Employee("Jenny", 72000),
            new Employee("James", 68000),
            new Employee("Jasmine", 73000)
        );

        // Filtering employees with salary greater than 60000
        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getSalary() > 60000)
            .collect(Collectors.toList());

        // Sorting employees by salary in descending order
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        // Finding the highest salary
        Optional<Employee> highestSalaryEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

        // Calculating the average salary
        double averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Filtered Employees: " + filteredEmployees);
        System.out.println("Sorted Employees: " + sortedEmployees);
        System.out.println("Highest Salary Employee: " + highestSalaryEmployee.orElse(null));
        System.out.println("Average Salary: " + averageSalary);
    }
}
