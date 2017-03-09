package edu.kis.vh.stacks;

public class Stack {
	
	private final int EMPTY_STACK_INDICATOR = -1;
	private final int FULL_STACK_INDICATOR = 11;

	private int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_INDICATOR;
	
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}
	
	public boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}
	
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return ITEMS[total];
	}
	
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return ITEMS[total--];
	}
				
}
