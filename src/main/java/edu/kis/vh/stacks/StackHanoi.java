package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int enteringValue) {
		if (!isEmpty() && enteringValue > top())
			totalRejected++;
		else
			super.push(enteringValue);
	}
}
