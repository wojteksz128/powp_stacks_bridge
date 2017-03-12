package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

/**
 * Default implementation of {@link StacksFactory}.
 * 
 * @author Wojciech Szczepaniak
 *
 */
public class DefaultStacksFactory implements StacksFactory {

	// TODO: What are the differences between methods getStandardStack() and getFalseStack()?
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getStandardStack()
	 */
	@Override
	public Stack getStandardStack() {
		return new Stack();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFalseStack()
	 */
	@Override
	public Stack getFalseStack() {
		return new Stack();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFIFOStack()
	 */
	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getHanoiStack()
	 */
	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
