package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class stackTest {
	
	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testFIFOPop() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.getFIFOStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testHanoiPush() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.getHanoiStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testReportRejected() {
		StackHanoi stackObj = new StackHanoi();
		final int REPORTED_REJECTED = 2;
		
		int testValue1 = 1;
		stackObj.push(testValue1);
		int testValue2 = 2;
		stackObj.push(testValue2);
		int testValue3 = 3;
		stackObj.push(testValue3);
		
		int result = stackObj.reportRejected();
		Assert.assertEquals(REPORTED_REJECTED, result);
	}
}
