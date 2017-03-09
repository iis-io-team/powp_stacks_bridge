package edu.kis.vh.stacks.list;

public class StackList {

	private Node lastNode; //po enkapsulacji modyfikator zmienił się na prywatny i dodano getter i setter
	private static final int EMPTY_STACK_INDICATOR = -1;

	public void pushElement(int nodeNumber) {
		if (lastNode == null)
			lastNode = new Node(nodeNumber);
		else {
			lastNode.setNextValue(new Node(nodeNumber));
			lastNode.getNextValue().setPreviousValue(lastNode);
			lastNode = lastNode.getNextValue();
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
			return EMPTY_STACK_INDICATOR;
		return lastNode.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_INDICATOR;
		int topValue = lastNode.getValue();
		lastNode = lastNode.getPreviousValue();
		return topValue;
	}

	Node getLastNode() {
		return lastNode;
	}

	void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

}
