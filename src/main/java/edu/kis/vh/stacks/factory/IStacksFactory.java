package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.FifoStack;
import edu.kis.vh.stacks.HanoiStack;

public interface IStacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public FifoStack getFifoStack();

	public HanoiStack getHanoiStack();

}
