package edu.kis.vh.stacks;

// TODO: Can you implement Stack with variable size? Maybe with parameter size in constructor? 
/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">stack</a> data structure. This structure in basically implement two methods:
 * <br>   - {@link Stack#push} - add element into the stack,
 * <br>   - {@link Stack#pop} - get last added element from the stack and remove it.
 * 
 * @author Wojciech Szczepaniak
 * 
 */
public class Stack {

	private static final int STACK_EMPTY = -1;

	private static final int STACK_SIZE = 12;

	private int[] items = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	/**
	 * Index of last inserted value into the stack. If stack is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return index of last inserted value
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Insert value into the stack.
	 * 
	 * @param i inserted value
	 */
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
		// TODO: Add action if push is impossible.
	}

	/**
	 * Returns true if stack contains no elements.
	 * 
	 * @return true if this stack contains no elements
	 */
	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	/**
	 * Returns true if stack cannot storied more elements.
	 * 
	 * @return true if this stack cannot storied more elements
	 */
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 * Return last inserted element into the stack without removing it. If stack is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return last inserted element
	 */
	public int top() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return STACK_EMPTY;
		}
		return items[total];
	}

	/**
	 * Return last inserted element into the stack and remove it. If stack is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return last inserted element
	 */
	public int pop() {
		if (isEmpty()) {
			// TODO: Maybe if stack is empty, than method should throw exception just like 'EmptyStackException'.
			return STACK_EMPTY;
		}
		return items[total--];
	}

}
