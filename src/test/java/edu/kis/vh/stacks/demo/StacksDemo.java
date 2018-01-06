package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

// Zle sformatowane wiersze: 20,21,22,24,25,26,27,28
// Alt + ← powrot do poprzednio edytowanego miejsca w kodzie
// Alt + → przelaczenie sie do nastepnego (w historii) edytowanego miejsca w kodzie (o ile takie istnieje)
class StacksDemo {

	public static void main(String[] args) {
		System.out.println("DefaultStacksFactory test");
		IStacksFactory factory = new DefaultStacksFactory();
		testStacks(factory);

		System.out.println("StackListFactory test");
		factory = new StackListFactory();
		testStacks(factory);

		System.out.println("StackArrayFactory test");
		factory = new StackArrayFactory();
		testStacks(factory);
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFifoStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

}