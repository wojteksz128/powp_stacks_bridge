package edu.kis.vh.stacks;

public class Stack {

	private static final int STACK_EMPTY = -1;

	private static final int STACK_SIZE = 12;

	private int[] items = new int[STACK_SIZE];

	public int total = STACK_EMPTY;

	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	public int top() {
		if (isEmpty()) {
			return -1;
		}
		return items[total];
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		return items[total--];
	}

}
