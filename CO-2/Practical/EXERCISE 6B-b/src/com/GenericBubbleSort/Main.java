package com.GenericBubbleSort;

public class Main {
    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        GenericBubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer array:");
        GenericBubbleSort.printArray(intArray);

        // Test with Double array
        Double[] doubleArray = {64.5, 34.2, 25.1, 12.0, 22.3, 11.4, 90.8};
        GenericBubbleSort.bubbleSort(doubleArray);
        System.out.println("Sorted Double array:");
        GenericBubbleSort.printArray(doubleArray);

        // Test with String array
        String[] stringArray = {"apple", "orange", "banana", "pear", "grape"};
        GenericBubbleSort.bubbleSort(stringArray);
        System.out.println("Sorted String array:");
        GenericBubbleSort.printArray(stringArray);
    }
}


