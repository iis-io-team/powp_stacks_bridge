package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;

public class StackTest {

	private Stack stackObj = null;

	@Before
	public void setUp() {
		stackObj = new Stack();
	}

	@Test
	public void testPush() {
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		Assert.assertFalse(stackObj.isFull());
	}

	@Test
	public void testIsFull() {
		for (int i = 0; i < Stack.DEFAULT_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		Assert.assertTrue(stackObj.isFull());
	}

	@Test
	public void testTop() {
		int result = stackObj.top();
		Assert.assertEquals(IStack.EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		int result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testMultiPop() {
		int firstValue = 1;
		int secondValue = 2;
		stackObj.push(firstValue);
		stackObj.push(secondValue);

		assertEquals(secondValue, stackObj.pop());
		assertEquals(firstValue, stackObj.pop());
	}

}
