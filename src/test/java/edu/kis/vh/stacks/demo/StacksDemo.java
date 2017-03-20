package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);
	}

	private static void testStacks(DefaultStacksFactory factory) {
        Stack[] stacks = {
                factory.getStandardStack(),
                factory.getFalseStack(),
                factory.getFIFOStack(),
                factory.getHanoiStack()
        };

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(rn.nextInt(20));
        }

        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }

            System.out.println();
        }

        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
    }

}

//linia 12 zmiana w farmacie stack
//linia 19 poprawne otoczenie klamrami petli
//linia 26 przesuniecie wciecia
//linia 36 przesuniecie wciecia
//linia 39 wciagniecie do jednej lini

//alt + -> przelaczanie miedzy ostatnio uzywanaymi oknami