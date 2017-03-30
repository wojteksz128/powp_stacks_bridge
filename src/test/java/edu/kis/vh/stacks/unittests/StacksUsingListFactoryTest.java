package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.StacksUsingListFactory;

public class StacksUsingListFactoryTest {
	
	private StacksUsingListFactory factory;
	
	@Before
	public void init() {
		this.factory = new StacksUsingListFactory();
	}
	
	@Test
	public void testGetStandardStack() {
		Assert.assertTrue(factory.getStandardStack() instanceof Stack);
	}
	
	@Test
	public void testGetFalseStack() {
		Assert.assertTrue(factory.getFalseStack() instanceof Stack);
	}
	
	@Test
	public void testGetFIFOStack() {
		Assert.assertTrue(factory.getFIFOStack() instanceof StackFIFO);
	}
	
	@Test
	public void testGetHanoiStack() {
		Assert.assertTrue(factory.getHanoiStack() instanceof StackHanoi);
	}
}
