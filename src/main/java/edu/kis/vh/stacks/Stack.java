/*
 * Adn 7. Wykonanie Refactor -> Generalize Declared Type spowodowało zmianę typu pola stack z StackList na Stackable. 
 */

package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;
import edu.kis.vh.stacks.list.Stackable;

// TODO: Can you implement Stack with variable size? Maybe with parameter size in constructor? 
/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">stack</a> data structure, where we can storied no more than {@value Stack#STACK_SIZE} elements. This structure in basically implement two methods:
 * <br>   - {@link Stack#push} - add element into the stack,
 * <br>   - {@link Stack#pop} - get last added element from the stack and remove it.
 * 
 * @author Wojciech Szczepaniak
 * 
 */
public class Stack {

	private Stackable stack;

	public Stack() {
		super();
		this.stack = new StackList();
	}

	public Stack(Stackable stack) {
		super();
		this.stack = stack;
	}

	/**
	 * @return index of last inserted value
	 * @see edu.kis.vh.stacks.StackArray#getTotal()
	 */
	public int getTotal() {
		return stack.getTotal();
	}

	/**
	 * @param i inserted value
	 * @see edu.kis.vh.stacks.StackArray#push(int)
	 */
	public void push(int i) {
		stack.push(i);
	}

	/**
	 * @return true if this stack contains no elements
	 * @see edu.kis.vh.stacks.StackArray#isEmpty()
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * @return true if this stack cannot storied more elements
	 * @see edu.kis.vh.stacks.StackArray#isFull()
	 */
	public boolean isFull() {
		return stack.isFull();
	}

	/**
	 * @return last inserted element
	 * @see edu.kis.vh.stacks.StackArray#top()
	 */
	public int top() {
		return stack.top();
	}

	/**
	 * @return last inserted element
	 * @see edu.kis.vh.stacks.StackArray#pop()
	 */
	public int pop() {
		return stack.pop();
	}
}
