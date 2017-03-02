package edu.kis.vh.stacks.list;

public class StackList {

	Node lastNode;

	public void pushElement(int nodeNumber) {
		if (lastNode == null)
			lastNode = new Node(nodeNumber);
		else {
			lastNode.nextValue = new Node(nodeNumber);
			lastNode.nextValue.previousValue = lastNode;
			lastNode = lastNode.nextValue;
		}
	}

	public boolean empty() {
		return lastNode == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return -1;
		return lastNode.value;
	}

	public int pop() {
		if (empty())
			return -1;
		int topValue = lastNode.value;
		lastNode = lastNode.previousValue;
		return topValue;
	}

}
