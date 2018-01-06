package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}
	
	public StackHanoi(int capacity) {
		super(capacity);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
