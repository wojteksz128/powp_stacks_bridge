/**
 * 
 */
package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

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
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFalseStack()
	 */
	@Override
	public Stack getFalseStack() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getFIFOStack()
	 */
	@Override
	public StackFIFO getFIFOStack() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.StacksFactory#getHanoiStack()
	 */
	@Override
	public StackHanoi getHanoiStack() {
		// TODO Auto-generated method stub
		return null;
	}

}
