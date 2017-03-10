package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private final Stack stack = new Stack();

	@Override
	public int pop() {
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
