package org.example;
import java.util.EmptyStackException;
import java.util.Objects;

public class Stack <T>{
    private final int capacity;
    private final Object[] items;
    private int size = 0;

    public Stack(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("The stack capacity must be greater than zero");
        this.capacity = capacity;
        this.items = new Object[capacity];
    }

    public void push(T item) {
        if (size == capacity) {
            throw new IllegalStateException("Stack overflow!");
        }
        items[size] = item;
        size+=1;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T item = (T) items[--size];
        items[size] = null;
        return item;
    }

    public T peek(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        return (T) items[--size];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}