package com.courseManagementSystem;

import java.util.Comparator;

public class CreditHoursComparator implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return Integer.compare(c1.getCreditHours(), c2.getCreditHours());
    }
}

