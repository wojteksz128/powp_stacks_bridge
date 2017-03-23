package edu.kis.vh.stacks.stackimplementation;

public class StackArray implements Stackable {

	private static final int STACK_SIZE = 12;

	private int[] items = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#getTotal()
	 */
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#push(int)
	 */
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
		// TODO: Add action if push is impossible.
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#isEmpty()
	 */
	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#isFull()
	 */
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#top()
	 */
	public int top() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return STACK_EMPTY;
		}
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.Stackable#pop()
	 */
	public int pop() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return STACK_EMPTY;
		}
		return items[total--];
	}
}
