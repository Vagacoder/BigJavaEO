package ch18;

import java.util.*;

public class Stack<E> {
    private Object[] elements;
    private int currentSize;

    private static final int INITIAL_SIZE = 10;

    public Stack() {
	elements = new Object[INITIAL_SIZE];
	// elements = new E[INITIAL_SIZE]
	// is an error--cannot make a generic array
    }

    public void push(E value) {
	if (currentSize >= elements.length) {
	    elements = Arrays.copyOf(elements, 2 * elements.length);
	}
	elements[currentSize] = value;
	currentSize++;
    }

    @SuppressWarnings("unchecked") // Suppresses "unchecked" warnings inside this method
    public E pop() {
	currentSize--;
	return (E) elements[currentSize]; // Cast causes "unchecked" warning
    }

    public int size() {
	return currentSize;
    }
}
