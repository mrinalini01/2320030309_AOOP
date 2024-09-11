package com.GenericStackInterface;

public class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void push(T element) {
        if (size == capacity) {
            throw new RuntimeException("Stack is full");
        }
        array[size++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = array[--size];
        array[size] = null; // Avoid memory leak
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}