package edu.kis.vh.stacks.unittests;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.list.StackList;
import junit.framework.Assert;


public class StackListTest {
	
	private StackList list;
	
	@Before
	public void init() {
		list = new StackList();
	}
	
	@Test
	public void testPushElement() {
		int value = 4;
		list.push(value);
		Assert.assertEquals(value, list.pop());
	}
	
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(list.isEmpty());
		
		list.push(1);
		
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void testPeek() {
		final int EMPTY_LIST = -1;
		Assert.assertEquals(EMPTY_LIST, list.top());
		
		int value = 4;
		list.push(value);
		
		Assert.assertEquals(value, list.top());
		Assert.assertEquals(value, list.top());
	}

	@Test
	public void testPop() {
		final int EMPTY_LIST = -1;
		
		int value = 4;
		list.push(value);
		
		Assert.assertEquals(value, list.pop());
		Assert.assertEquals(EMPTY_LIST, list.pop());
	}
}
