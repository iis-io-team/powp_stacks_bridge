package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack();
	}

	@Override
	public Stack getFalseStack() {
		return new Stack();
	}

	@Override
	public StackFifo getFifoStack() {
		return new StackFifo();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
