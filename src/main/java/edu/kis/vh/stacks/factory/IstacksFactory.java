package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

	public interface IstacksFactory {
	
		public stack getStandardStack();
		
		public stack getFalseStack();
		
		public StackFIFO getFIFOStack();
		
		public StackHanoi getHanoiStack();
		
	}
