package edu.kis.vh.stacks;

/**
 * @author Sebastian
 * basic stack def
 */
public class Stack {

	private static final int STACK_SIZE = 12;

	private static final int MIN = -1;

	private final int[] items = new int[STACK_SIZE];

	private int total = MIN;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == MIN;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return MIN;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return MIN;
		return items[total--];
	}

}
