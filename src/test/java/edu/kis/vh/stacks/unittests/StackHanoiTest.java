package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	
	@Test
	public void testPush() {
		StackHanoi stack = new StackHanoi();
		
		int firstValue = 4;
		stack.push(firstValue);
		Assert.assertEquals(firstValue, stack.top());
	}
	
	@Test
	public void testReportRejected() {
		StackHanoi stack = new StackHanoi();
		
		Assert.assertEquals(0, stack.reportRejected());
		
		int firstValue = 2;
		stack.push(firstValue);
		Assert.assertEquals(firstValue, stack.top());
		Assert.assertEquals(0, stack.reportRejected());
		
		int secondValue = 3;
		stack.push(secondValue);
		Assert.assertEquals(firstValue, stack.top());
		Assert.assertEquals(1, stack.reportRejected());
		
		int thirdValue = 1;
		stack.push(thirdValue);
		Assert.assertEquals(thirdValue, stack.top());
		Assert.assertEquals(1, stack.reportRejected());
	}
	
	@Test
	public void testIsEmpty() {
		StackHanoi stack = new StackHanoi();
		Assert.assertTrue(stack.isEmpty());
		
		stack.push(123);
		
		Assert.assertFalse(stack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		StackHanoi stack = new StackHanoi();
		final int STACK_FIFO_CAPACITY = 12;
		for (int i = 0; i < STACK_FIFO_CAPACITY; ++i) {
			Assert.assertFalse(stack.isFull());
			stack.push(123);
		}
		
		Assert.assertFalse(stack.isFull());
	}
	
	@Test
	public void testTop() {
		StackHanoi stack = new StackHanoi();
		final int EMPTY_STACK_VALUE = -1;
		
		Assert.assertEquals(EMPTY_STACK_VALUE, stack.top());
		
		int testValue = 4;
		stack.push(testValue);
		
		Assert.assertEquals(testValue, stack.top());
		Assert.assertEquals(testValue, stack.top());
	}
	
	@Test
	public void testPop() {
		StackHanoi stack = new StackHanoi();
		final int EMPTY_STACK_VALUE = -1;
		
		Assert.assertEquals(EMPTY_STACK_VALUE, stack.pop());
		
		int testValue = 4;
		stack.push(testValue);
		
		Assert.assertEquals(testValue, stack.pop());
		Assert.assertEquals(EMPTY_STACK_VALUE, stack.pop());
	}
	
	@Test
	public void testPopOrder() {
		StackHanoi stack = new StackHanoi();
		int firstValue = 2,
			secondValue = 1;
		
		stack.push(firstValue);
		stack.push(secondValue);
		
		Assert.assertEquals(secondValue, stack.pop());
		Assert.assertEquals(firstValue, stack.pop());
	}
}
