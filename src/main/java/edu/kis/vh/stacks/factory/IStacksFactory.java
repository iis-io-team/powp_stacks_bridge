package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

interface IStacksFactory {

	public Stack getStandardStack(int capacity);

	public Stack getFalseStack(int capacity);

	public StackFifo getFifoStack(int capacity);

	public StackHanoi getHanoiStack(int capacity);

}
