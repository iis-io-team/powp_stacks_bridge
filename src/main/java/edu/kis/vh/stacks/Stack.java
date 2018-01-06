package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * Represents the default Stack.
 * 
 * @author rafal
 *
 */
public class Stack {

	/** The empty stack value. */
	public static final int EMPTY_STACK_VALUE = -1;

	/** The default capacity. */
	public static final int DEFAULT_CAPACITY = 12;

	/** The elements in stack. */
	private final StackArray stackArray;

	private final StackList stackList;

	/** The total number of elements in stack. */
	private int total = EMPTY_STACK_VALUE;

	/**
	 * Create new instance of Stack with default capacity.
	 */
	public Stack() {
		this.stackArray = new StackArray(DEFAULT_CAPACITY);
		this.stackList = null;
	}

	public Stack(StackArray stackArray) {
		this.stackArray = stackArray;
		this.stackList = null;
	}

	public Stack(StackList stackList) {
		this.stackArray = null;
		this.stackList = stackList;
	}

	/**
	 * Adds new value to stack.
	 * 
	 * @param i
	 *            The value to add.
	 */
	public void push(int i) {
		if (!isFull()) {
			if (stackArray != null) {
				stackArray.set(i, ++total);
			} else {
				stackList.pushElement(i);
			}
		}
	}

	/**
	 * @return <code>true</code> if stack is empty.
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/**
	 * @return <code>true</code> if total number of items reached stack capacity.
	 */
	public boolean isFull() {
		if (stackArray != null) {
			return total == stackArray.getCapacity() - 1;
		}
		return false;
	}

	/**
	 * @return The last value in stack (or {@link EMPTY_STACK_VALUE} if empty).
	 */
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		if (stackArray != null) {
			return stackArray.get(total);
		}
		return stackList.peek();
	}

	/**
	 * 
	 * @return The last value and remove it from stack.
	 */
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		if (stackArray != null) {
			return stackArray.get(total--);
		}
		return stackList.pop();
	}

	/**
	 * 
	 * @return The total number of items in stack.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @return The capacity of this stack.
	 */
	public int getCapacity() {
		return stackArray.getCapacity();
	}

}
