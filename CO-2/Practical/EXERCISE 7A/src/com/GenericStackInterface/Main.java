package com.GenericStackInterface;

public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack (Integer) peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack (Integer) pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack (Integer) isEmpty: " + linkedListStack.isEmpty());

        // Test ArrayStack with String
        Stack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("apple");
        arrayStack.push("banana");
        arrayStack.push("cherry");
        System.out.println("ArrayStack (String) peek: " + arrayStack.peek());
        System.out.println("ArrayStack (String) pop: " + arrayStack.pop());
        System.out.println("ArrayStack (String) isEmpty: " + arrayStack.isEmpty());
    }
}

