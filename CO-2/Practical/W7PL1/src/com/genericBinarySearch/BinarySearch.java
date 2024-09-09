package com.genericBinarySearch;

import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {
    private T[] data;

    public BinarySearch(T[] data) {
        this.data = data;
        Arrays.sort(this.data);
    }
    
    public int search(T target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = data[mid].compareTo(target);

            if (cmp < 0) {
                low = mid + 1;
            } 
            else if (cmp > 0) {
                high = mid - 1;
            } 
            else {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 3, 5, 7, 9};
        BinarySearch<Integer> intSearch = new BinarySearch<>(intArray);
        System.out.println("Index of 5: " + intSearch.search(5)); 

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        BinarySearch<Double> doubleSearch = new BinarySearch<>(doubleArray);
        System.out.println("Index of 3.3: " + doubleSearch.search(3.3));  

        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        BinarySearch<String> stringSearch = new BinarySearch<>(stringArray);
        System.out.println("Index of 'cherry': " + stringSearch.search("cherry"));  
    }
}