package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	public Stack temp = new Stack();
	
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int topValue = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return topValue;
	}
}
