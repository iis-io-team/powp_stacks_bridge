package edu.kis.vh.stacks.impl;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {

	private Node last;

	@Override
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

}
