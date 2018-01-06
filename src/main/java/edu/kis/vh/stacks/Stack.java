package edu.kis.vh.stacks;

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
	private final StackArray items;

	/** The total number of elements in stack. */
	private int total = EMPTY_STACK_VALUE;

	/** The stacks capacity. */
	private final int capacity;

	/**
	 * Create new instance of Stack with default capacity.
	 */
	public Stack() {
		this.capacity = DEFAULT_CAPACITY;
		this.items = new StackArray(DEFAULT_CAPACITY);
	}

	/**
	 * Creates new instance of Stack with given capacity.
	 * 
	 * @param capacity
	 *            The max capacity of this stack.
	 */
	public Stack(int capacity) {
		this.capacity = capacity;
		this.items = new StackArray(capacity);
	}

	/**
	 * Adds new value to stack.
	 * 
	 * @param i
	 *            The value to add.
	 */
	public void push(int i) {
		if (!isFull()) {
			items.set(i, ++total);
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
		return total == capacity - 1;
	}

	/**
	 * @return The last value in stack (or {@link EMPTY_STACK_VALUE} if empty).
	 */
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items.get(total);
	}

	/**
	 * 
	 * @return The last value and remove it from stack.
	 */
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items.get(total--);
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
		return capacity;
	}

}
