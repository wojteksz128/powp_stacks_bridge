package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	@Test
	public void testPush() {
		StackFIFO stack = new StackFIFO();
		int testValue = 4;
		stack.push(testValue);
		
		Assert.assertEquals(testValue, stack.top());
	}
	
	@Test
	public void testIsEmpty() {
		StackFIFO stack = new StackFIFO();
		Assert.assertTrue(stack.isEmpty());
		
		stack.push(123);
		
		Assert.assertFalse(stack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		StackFIFO stack = new StackFIFO();
		final int STACK_FIFO_CAPACITY = 12;
		for (int i = 0; i < STACK_FIFO_CAPACITY; ++i) {
			Assert.assertFalse(stack.isFull());
			stack.push(123);
		}
		
		Assert.assertTrue(stack.isFull());
	}
}
