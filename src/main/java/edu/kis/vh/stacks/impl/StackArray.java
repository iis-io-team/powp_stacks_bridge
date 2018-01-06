package edu.kis.vh.stacks.impl;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;

public class StackArray implements IStack {

	private final int items[];

	private int total = EMPTY_STACK_VALUE;

	private final int capacity;

	public StackArray() {
		this.capacity = Stack.DEFAULT_CAPACITY;
		this.items = new int[Stack.DEFAULT_CAPACITY];
	}

	public StackArray(int capacity) {
		this.capacity = capacity;
		this.items = new int[capacity];
	}

	int getCapacity() {
		return capacity;
	}

	@Override
	public void push(int i) {
		if (!isFull()) {
			items[total++] = i;
		}
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == capacity;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items[total - 1];
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items[--total];
	}

}
