package edu.kis.vh.stacks;


/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Queue_(abstract_data_type)">queue</a> data structure. This structure implement two methods:
 * <br>   - {@link StackFIFO#push} - add element into the queue,
 * <br>   - {@link StackFIFO#pop} - get first element from the queue and remove it.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class StackFIFO extends Stack {

	private final Stack stack = new Stack();

	/**
	 * Return first inserted element and remove it. If queue is empty, than return {@link Stack#STACK_EMPTY}.
	 * 
	 * @return last inserted element
	 */
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
