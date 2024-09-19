package com.courseManagementSystem;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UniversityCourseRegistrationSystem system = new UniversityCourseRegistrationSystem();

        system.registerCourse(new Course("Data Structures", 3));
        system.registerCourse(new Course("Algorithms", 4));
        system.registerCourse(new Course("Operating Systems", 3));
        system.registerCourse(new Course("Computer Networks", 2));

        System.out.println("Courses sorted by name:");
        system.sortCoursesByName();
        system.displayCourses();

        System.out.println("\nCourses sorted by credit hours:");
        system.sortCoursesByCreditHours();
        system.displayCourses();

        Course clonedCourse = system.cloneCourse(new Course("Machine Learning", 4));
        System.out.println("\nCloned Course: " + clonedCourse);

        System.out.println("\nIterating through registered courses:");
        Iterator<Course> iterator = system.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

