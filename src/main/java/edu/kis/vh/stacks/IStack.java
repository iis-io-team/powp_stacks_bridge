package edu.kis.vh.stacks;

public interface IStack {

	// Wspolna wartosc ktora zwracamy w implementacjach tego interfejsu jest jak
	// najbardziej pomocna.
	public static final int EMPTY_STACK_VALUE = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}
