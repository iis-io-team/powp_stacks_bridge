package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackArray;

// Po refaktoryzacji zwiazanej z utworzeniem interfejsu IStack, klasa Stack przestala byc potrzebna.
// Wyjatkiem jest domyslny konstruktor, ktory dostarcza nam implementacje klasy StackArray.

/**
 * Represents the default Stack.
 * 
 * @author rafal
 *
 */
public class Stack {

	/** The default capacity. */
	public static final int DEFAULT_CAPACITY = 12;

	/** The elements in stack. */
	private final IStack stack;

	/**
	 * Create new instance of Stack with default capacity.
	 */
	public Stack() {
		this.stack = new StackArray(DEFAULT_CAPACITY);
	}

	public Stack(IStack stack) {
		this.stack = stack;
	}

	/**
	 * Adds new value to stack.
	 * 
	 * @param i
	 *            The value to add.
	 */
	public void push(int i) {
		stack.push(i);
	}

	/**
	 * @return <code>true</code> if stack is empty.
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * @return <code>true</code> if total number of items reached stack capacity.
	 */
	public boolean isFull() {
		return stack.isFull();
	}

	/**
	 * @return The last value in stack (or {@link EMPTY_STACK_VALUE} if empty).
	 */
	public int top() {
		return stack.top();
	}

	/**
	 * 
	 * @return The last value and remove it from stack.
	 */
	public int pop() {
		return stack.pop();
	}

}
