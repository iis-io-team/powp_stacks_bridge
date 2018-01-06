package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public StackFifo getFifoStack();

	public StackHanoi getHanoiStack();

}
