package edu.kis.vh.stacks.list;

public class StackList {

	private Node last;

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
			return -1;
		return last.getValue;
	}

	public int pop() {
		if (empty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

public class Node {

	private int value;
	private Node prev;
	private Node next;

	Node(int i) {
		setValue(i);
	}

	public int getValue() {
 		return value;
 	}

 	public void setValue(int value) {
 		this.value = value;
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