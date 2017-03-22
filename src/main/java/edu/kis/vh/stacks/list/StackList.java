package edu.kis.vh.stacks.list;

public class StackList {

	private static final int STACK_EMPTY = -1;
	private Node last;
	int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
