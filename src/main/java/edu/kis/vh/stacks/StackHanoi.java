package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackimplementation.Stackable;

/**
 * Implementation of stack on the <a href="https://en.wikipedia.org/wiki/Tower_of_Hanoi">Tower of Hanoi</a> problem. You can push into the stack only element not greater than last pushed element.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(Stackable stack) {
		super(stack);
	}

	/**
	 * Return number of wrong inserted into the stack. 
	 * 
	 * @return number of wrong inserted
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Insert value into the stack. If added element is greater than last inserted element, this element is not inserted, and number of wrong inserts is increasing by 1.
	 * 
	 * @param in added value
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top()) {
			// TODO: Maybe if inserted element cannot be push in this stack, than method should throw exception just like 'PushException'.
			totalRejected++;
		} else {
			super.push(in);
		}
	}
}
