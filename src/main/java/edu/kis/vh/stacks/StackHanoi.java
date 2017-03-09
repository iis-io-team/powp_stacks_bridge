package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int enteringValue) {
		if (!isEmpty() && enteringValue > top())
			totalRejected++;
		else
			super.push(enteringValue);
	}
}
