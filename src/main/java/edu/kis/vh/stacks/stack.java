package edu.kis.vh.stacks;

public class stack {
	private final int size = 12;
	private final int emptyStack = -1;
	private int[] ITEMS = new int[size];

	private int total = emptyStack;

	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == emptyStack;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total--];
	}

	public int getTotal() {
		return total;
	}


}
