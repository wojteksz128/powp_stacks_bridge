/*
 * Wnioski dla punktu 13:
 *    - wymienione funkcje programu Eclipse przydadzą się do analizy budowy kodu,
 *    - funkcje pomagają przy znalezieniu implementacji klasy, metody, itp.
 */

package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackimplementation.StackList;
import edu.kis.vh.stacks.stackimplementation.Stackable;

/**
 * Implementation of <a href="https://en.wikipedia.org/wiki/Queue_(abstract_data_type)">queue</a> data structure. This structure implement two methods:
 * <br>   - {@link StackFIFO#push} - add element into the queue,
 * <br>   - {@link StackFIFO#pop} - get first element from the queue and remove it.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class StackFIFO extends Stack {

	// Konieczne jest użycie StackList, ze względu na to, że standardowa implementacja Stack używa StackList w swojej implementacji. Użycie StackArray mogłoby spowodować problemy, gdy jest więcej elementów w StackFIFO niż STACK_SIZE.
	private final Stack stack;

	public StackFIFO() {
		super();
		stack = new Stack(new StackList());
	}

	public StackFIFO(Stackable stack) {
		super(stack);
		this.stack = new Stack(stack);
	}

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
