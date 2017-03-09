package edu.kis.vh.stacks.list;

public class StackList {

	private Node lastNode; //po enkapsulacji modyfikator zmienił się na prywatny i dodano getter i setter
	private static final int EMPTY_STACK_INDICATOR = -1; //final dodany wcześniej

	public void pushElement(int nodeNumber) {
		if (lastNode == null)
			lastNode = new Node(nodeNumber);
		else {
			lastNode.setNextValue(new Node(nodeNumber)); //automatycznie zmienione po enkapsulacji atrybutów z klasy Node
			lastNode.getNextValue().setPreviousValue(lastNode); //automatycznie zmienione po enkapsulacji atrybutów z klasy Node
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

class Node {

	private int value;
	private Node previousValue;
	private Node nextValue;
	//po enkapsulacji modyfikatory wszystkich 3 atrybutów zmieniły się na private i dodane zostały ich gettery i settery

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(Node previousValue) {
		this.previousValue = previousValue;
	}

	public Node getNextValue() {
		return nextValue;
	}

	public void setNextValue(Node nextValue) {
		this.nextValue = nextValue;
	}
	
}
