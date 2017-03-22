package edu.kis.vh.stacks;

/**
 * @author Sebastian
 * fifo stack def
 */
public class FifoStack extends Stack {

	private final Stack temp = new Stack();

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
