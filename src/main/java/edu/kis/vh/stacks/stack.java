package edu.kis.vh.stacks;

public class stack {
	private final int size = 12;
	private final int emptyStack = -1;
	private int[] ITEMS = new int[size];

	private int total = emptyStack;


	/**
	 * Ta metoda dodaje nowe elementy do stosu
	 * @param i to element ktory bedzie dodany
	 */
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}

	/**
	 * Ta metoda sprawdza czy stos jest pusty
	 * @return zwraca prawde jesli stos jest pusty
	 */
	public boolean isEmpty() {
		return total == emptyStack;
	}

	/**
	 * Ta metoda sprawdza czy stos jest pelen
	 * @return zwraca prawde jezeli stos jest pelen
	 */
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * Ta metoda zwraca wartosc z gory stosu
	 */
	public int top() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total];
	}

	/**
	 * Ta metoda zwraca wartosc z gory stosu oraz ja usuwa
	 */
	public int pop() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total--];
	}

	/**
	 * Ta metoda to getter dla wartosci total
	 */
	public int getTotal() {
		return total;
	}


}
