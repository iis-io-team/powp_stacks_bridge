package edu.kis.vh.stacks.list;

public class Node {

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
