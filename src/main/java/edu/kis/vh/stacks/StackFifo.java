package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackArray;

public class StackFifo extends Stack {

	private final IStack temp;

	public StackFifo() {
		super();
		// Najszybszym wyborem bedzie StackArray, ktory posiada z gory ustalony rozmiar
		// pamieci do zaalokowania, w przeciwienistwie do dynamicznie zmieniajacej
		// rozmiar listy.
		temp = new StackArray(Stack.DEFAULT_CAPACITY);
	}

	public StackFifo(IStack stack) {
		super(stack);
		temp = stack;
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
