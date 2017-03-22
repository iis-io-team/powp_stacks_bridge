package edu.kis.vh.stacks.list;

public class Node {
//using getters and setters in StackList to get and set fields
	protected int value;
	protected Node prev;
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

}
