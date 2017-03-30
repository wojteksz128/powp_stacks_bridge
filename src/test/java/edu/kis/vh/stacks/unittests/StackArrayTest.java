package edu.kis.vh.stacks.unittests;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.stackimplementation.StackArray;
import edu.kis.vh.stacks.stackimplementation.Stackable;
import junit.framework.Assert;


public class StackArrayTest {
	
	private Stackable stackArray;
	
	@Before
	public void init() {
		stackArray = new StackArray();
	}
	
	@Test
	public void testPushElement() {
		int value = 4;
		stackArray.push(value);
		Assert.assertEquals(value, stackArray.pop());
	}
	
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(stackArray.isEmpty());
		
		stackArray.push(1);
		
		Assert.assertFalse(stackArray.isEmpty());
	}

	@Test
	public void testIsFull() {
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackArray.isFull();
			Assert.assertEquals(false, result);
			stackArray.push(888);
		}

		boolean result = stackArray.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeek() {
		final int EMPTY_LIST = 0;
		Assert.assertEquals(EMPTY_LIST, stackArray.top());
		
		int value = 4;
		stackArray.push(value);
		
		Assert.assertEquals(value, stackArray.top());
		Assert.assertEquals(value, stackArray.top());
	}

	@Test
	public void testPop() {
		final int EMPTY_LIST = 0;
		
		int value = 4;
		stackArray.push(value);
		
		Assert.assertEquals(value, stackArray.pop());
		Assert.assertEquals(EMPTY_LIST, stackArray.pop());
	}
}
