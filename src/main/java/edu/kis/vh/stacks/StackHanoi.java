package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

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
