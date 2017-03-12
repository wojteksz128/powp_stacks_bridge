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
		list.pushElement(value);
		Assert.assertEquals(value, list.pop());
	}
	
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(list.empty());
		
		list.pushElement(1);
		
		Assert.assertFalse(list.empty());
	}
	
}
