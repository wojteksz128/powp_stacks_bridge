package edu.kis.vh.stacks.stackimplementation;

import edu.kis.vh.stacks.Stack;

public interface Stackable {

	/**
	 * Index of last inserted value into the stack. If stack is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return index of last inserted value
	 */
	int getTotal();

	/**
	 * Insert value into the stack.
	 * 
	 * @param i inserted value
	 */
	void push(int i);

	/**
	 * Returns true if the stack contains no elements.
	 * 
	 * @return true if this stack contains no elements
	 */
	boolean isEmpty();

	// TODO: This method is needed? 
	/**
	 * Returns true if stack cannot storied more elements.
	 * 
	 * @return true if this stack cannot storied more elements
	 */
	boolean isFull();

	/**
	 * Return last inserted value from the stack without removing it. If stack is empty, than return {@link StackList#STACK_EMPTY}.
	 * 
	 * @return last inserted value
	 */
	int top();

	/**
	 * Return last inserted value from the stack and remove it. If stack is empty, than return {@link StackList#STACK_EMPTY}.
	 * 
	 * @return last inserted value
	 */
	int pop();

}