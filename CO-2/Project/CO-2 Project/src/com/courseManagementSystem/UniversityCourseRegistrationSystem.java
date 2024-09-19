package com.courseManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UniversityCourseRegistrationSystem implements Iterable<Course> {
    private List<Course> registeredCourses;

    public UniversityCourseRegistrationSystem() {
        registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public void sortCoursesByName() {
        Collections.sort(registeredCourses);
    }

    public void sortCoursesByCreditHours() {
        Collections.sort(registeredCourses, new CreditHoursComparator());
    }

    public Course cloneCourse(Course course) throws CloneNotSupportedException {
        return (Course) course.clone();
    }

    @Override
    public Iterator<Course> iterator() {
        return registeredCourses.iterator();
    }

    public void displayCourses() {
        for (Course course : registeredCourses) {
            System.out.println(course);
        }
    }
}
