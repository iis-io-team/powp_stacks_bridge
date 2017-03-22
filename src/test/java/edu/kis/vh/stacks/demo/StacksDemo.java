package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.HanoiStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

/**
 * @author Sebastian
 *Testing stacks
 */
class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);

	}
	// 13,19-27 to big intend
	// alt + arrow move between files

	private static void testStacks(DefaultStacksFactory factory) {
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

		System.out.println("total rejected is " + ((HanoiStack) stacks[3]).reportRejected());
	}

}