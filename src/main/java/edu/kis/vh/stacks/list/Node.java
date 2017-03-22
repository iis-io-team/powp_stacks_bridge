package edu.kis.vh.stacks.list;

public class Node {
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
