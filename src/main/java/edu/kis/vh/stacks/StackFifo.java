package edu.kis.vh.stacks;

public class StackFifo extends Stack {

	private final Stack temp;

	public StackFifo() {
		super();
		temp = new Stack();
	}

	public StackFifo(int capacity) {
		super(capacity);
		temp = new Stack(capacity);
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
