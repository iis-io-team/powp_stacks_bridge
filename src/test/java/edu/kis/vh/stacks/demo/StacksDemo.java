package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		
		stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(), factory.GetHanoiStack()};
		
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
				System.out.println();
			}
		}
		
		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
		
		//plik StacksDemo.java:
		//linia 32 z System.out.println, zamiast 2 wierszy w jednym
		// linia 12 z stack[], zamiast 2 wierszy w jednym
		//wiersze 15-19 klamry od for
		//wiersze 21-30 klamry od pętli i wcięcia
		//plik stack.java od 14 do 32 wiersza
		//plik StackFIFO.java 10-11 i 15-16 wiersz
		//plik StackHanoi.java 5, 8, 12-15 wiersz
		//plik IstacksFactory 9-12 wiersz
		//alt + ← oraz alt + → powoduje przeskoczenie pomiędzy ostatnio edytowanymi plikami do lokalizacji gdzie wykonywana była ostatnia zmiana.
		//Strzałka w lewo cofa się w historii, strzałka w prawo idzie do przodu.
		
	}
	
}