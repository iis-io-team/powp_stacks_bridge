package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack(int capacity) {
		return new Stack(capacity);
	}

	@Override
	public Stack getFalseStack(int capacity) {
		return new Stack(capacity);
	}

	@Override
	public StackFifo getFifoStack(int capacity) {
		return new StackFifo(capacity);
	}

	@Override
	public StackHanoi getHanoiStack(int capacity) {
		return new StackHanoi(capacity);
	}

}
