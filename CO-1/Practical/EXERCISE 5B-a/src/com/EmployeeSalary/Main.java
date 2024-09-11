package com.EmployeeSalary;

public class Main {
    public static void main(String[] args) {
        // Create employee instances
        Employee emp1 = new Employee("Alice", "Developer");
        Employee emp2 = new Employee("Bob", "Manager");
        Employee emp3 = new Employee("Charlie", "Intern");

        // Create SalaryCalculator instance
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        // Calculate and display salaries
        System.out.println(emp1.getName() + "'s Salary: " + salaryCalculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s Salary: " + salaryCalculator.calculateSalary(emp2));
        System.out.println(emp3.getName() + "'s Salary: " + salaryCalculator.calculateSalary(emp3));
    }
}

