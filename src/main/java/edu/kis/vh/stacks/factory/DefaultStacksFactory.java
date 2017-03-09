package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements StacksFactory {

	@Override
	public stack GetStandardStack() {
		return new stack();
	}

	@Override
	public stack GetFalseStack() {
		return new stack();
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi();
	}

}
