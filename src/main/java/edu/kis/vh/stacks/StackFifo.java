package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackArray;

public class StackFifo extends Stack {

	private final Stack temp;

	public StackFifo() {
		super();
		temp = new Stack();
	}

	public StackFifo(StackArray stackArray) {
		super(stackArray);
		temp = new Stack(stackArray);
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
