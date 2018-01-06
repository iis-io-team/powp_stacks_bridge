package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IstacksFactory {

	public stack GetStandardStack();
	
	public stack GetFalseStack();
	
	public StackFIFO GetFIFOStack();
	
	public StackHanoi GetHanoiStack();
	
}
