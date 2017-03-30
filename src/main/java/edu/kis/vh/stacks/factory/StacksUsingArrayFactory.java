/**
 * 
 */
package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stackimplementation.StackArray;
import edu.kis.vh.stacks.stackimplementation.StackList;

/**
 * @author Wojciech Szczepaniak
 *
 */
public class StacksUsingArrayFactory implements StacksFactory {

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getStandardStack()
	 */
	@Override
	public Stack getStandardStack() {
		return new Stack(new StackArray());
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFalseStack()
	 */
	@Override
	public Stack getFalseStack() {
		return new Stack(new StackList());
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFIFOStack()
	 */
	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO(new StackArray());
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getHanoiStack()
	 */
	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi(new StackArray());
	}

}
