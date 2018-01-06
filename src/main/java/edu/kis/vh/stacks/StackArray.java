package edu.kis.vh.stacks;

class StackArray {

	private final int items[];
	
	private final int capacity;

	public StackArray(int capacity) {
		this.capacity = capacity;
		this.items = new int[capacity];
	}

	int get(int position) {
		return items[position];
	}

	void set(int value, int position) {
		items[position] = value;
	}
	
	int getCapacity() {
		return capacity;
	}

}
