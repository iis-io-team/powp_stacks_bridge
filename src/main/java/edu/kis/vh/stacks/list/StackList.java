package edu.kis.vh.stacks.list;

/**
 * @author Sebastian
 * stack list def
 */
public class StackList {
	
	private class Node {
		//using getters and setters in StackList to get and set fields
			private int value;
			private Node prev;
			private Node next;

			public Node(int i) {
				value = i;
			}

			protected Node getNext() {
				return next;
			}

			protected void setNext(Node next) {
				this.next = next;
			}

			protected Node getPrev() {
				return prev;
			}

			protected void setPrev(Node prev) {
				this.prev = prev;
			}

			protected int getValue() {
				return value;
			}


		}


	private static final int STACK_EMPTY = -1;
	private Node last;
	int i;

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
			return STACK_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return STACK_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
