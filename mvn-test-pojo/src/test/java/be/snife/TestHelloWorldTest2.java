package be.snife;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloWorldTest2 {

	@Test
	void testGetHello() {
		TestHelloWorld thw = new TestHelloWorld();
		assertEquals("Hello World",thw.getHello());
	}

}
