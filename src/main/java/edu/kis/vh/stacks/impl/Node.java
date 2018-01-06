package edu.kis.vh.stacks.impl;

class Node {

	// W klasie StackList dostep do ponizszych zmiennych odbywa sie teraz poprzez
	// gettery i settery, z wyjatkiem value, ktora jest tylko zwracana, nigdy nie modyfikowana.
	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
