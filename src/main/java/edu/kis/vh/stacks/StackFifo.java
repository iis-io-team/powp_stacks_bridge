package edu.kis.vh.stacks;

public class StackFifo extends Stack {

	public Stack temp = new Stack();

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
