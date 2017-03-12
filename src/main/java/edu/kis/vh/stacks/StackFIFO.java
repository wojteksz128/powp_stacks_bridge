package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private final Stack stack = new Stack();

	@Override
	public int pop() {
		// TODO: This implementation may produce problems when after pop() you push() new element. Maybe list is better option?
		while (!isEmpty()) {
			stack.push(super.pop());
		}

		int ret = stack.pop();

		while (!stack.isEmpty()) {
			push(stack.pop());
		}

		return ret;
	}
}
