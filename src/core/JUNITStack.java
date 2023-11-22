package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	@Test
	void testPushElmToTop() {
		Stack s2 = new Stack();
		s2.push(1);
		assertEquals(s2.top(), 1);
	}
	@Test
	void testLastInFirstOut() {
		Stack s3 = new Stack();
		s3.push(1);
		s3.push(2);
		assertEquals(2, s3.pop());
		assertEquals(1, s3.pop());
	}
	@Test
	void testElmToLimitedSizeStack() {
		Stack s4 = new Stack();
		s4.push(1);
		s4.push(2);
		s4.push(3);
		s4.push(4);
		assertEquals(s4.top(), 3);
	}
}
