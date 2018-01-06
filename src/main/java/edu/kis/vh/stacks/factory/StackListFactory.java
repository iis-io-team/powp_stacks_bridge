package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.impl.StackArray;
import edu.kis.vh.stacks.impl.StackList;

public class StackListFactory implements IStacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackArray());
	}

	@Override
	public StackFifo getFifoStack() {
		return new StackFifo(new StackList());
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi(new StackList());
	}

}
