package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private Stack temp = new Stack(); //po enkapsulacji dodanie gettera i settera po enkapsulacji
	
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
