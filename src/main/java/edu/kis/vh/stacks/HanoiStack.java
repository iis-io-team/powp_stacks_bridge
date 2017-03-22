package edu.kis.vh.stacks;

/**
 * @author Sebastian
 *hanoi stack def
 */
public class HanoiStack extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
