package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(StackArray stackArray) {
		super(stackArray);
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
