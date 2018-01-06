package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
