package edu.kis.vh.stacks.list;

public class StackList {

	private static final int STACK_EMPTY = -1;
	private Node last;
	int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().prev = last;
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
			return STACK_EMPTY;
		return last.value;
	}

	public int pop() {
		if (empty())
			return STACK_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
