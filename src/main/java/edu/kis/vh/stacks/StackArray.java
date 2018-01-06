package edu.kis.vh.stacks;

class StackArray implements IStack {

	private final int items[];

	private int total = EMPTY_STACK_VALUE;

	public static final int EMPTY_STACK_VALUE = -1;

	private final int capacity;

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
			items[++total] = i;
		}
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == capacity - 1;
	}

	@Override
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return items[total--];
	}

}
