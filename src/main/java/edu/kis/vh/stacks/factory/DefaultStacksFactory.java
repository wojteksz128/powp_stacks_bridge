package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements StacksFactory {

	// TODO: What are the differences between methods getStandardStack() and getFalseStack()?
	@Override
	public Stack getStandardStack() {
		return new Stack();
	}

	@Override
	public Stack getFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
