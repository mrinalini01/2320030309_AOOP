package com.ComparatorEmployee;

import java.util.*;

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "Engineering", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 55000));
        employees.add(new Employee(4, "Dave", "Engineering", 60000));
        employees.add(new Employee(5, "Eve", "HR", 45000));

        System.out.println("Sort by Salary (Ascending):");
        Collections.sort(employees, new SalaryAscend());
        employees.forEach(System.out::println);

        System.out.println("\nSort by Salary (Descending):");
        Collections.sort(employees, new SalaryDescend());
        employees.forEach(System.out::println);

        System.out.println("\nSort by Name:");
        Collections.sort(employees, new NameComparator());
        employees.forEach(System.out::println);

        System.out.println("\nSort by Department:");
        Collections.sort(employees, new DepartmentComparator());
        employees.forEach(System.out::println);
    }
}
