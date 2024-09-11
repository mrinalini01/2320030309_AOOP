package com.ComparatorEmployee;

import java.util.*;

class SalaryDescend implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
