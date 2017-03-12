package edu.kis.vh.stacks;

// TODO: Can you implement Stack with variable size? Maybe with parameter size in constructor? 
public class Stack {

	private static final int STACK_EMPTY = -1;

	private static final int STACK_SIZE = 12;

	private int[] items = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	public int getTotal() {
		return total;
	}


	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
		// TODO: Add action if push is impossible.
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	public int top() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return -1;
		}
		return items[total];
	}

	public int pop() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return -1;
		}
		return items[total--];
	}

}
