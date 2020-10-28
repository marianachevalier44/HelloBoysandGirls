package fr.mariana;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
	/**
	 * Rigorous Test.
	 */
	@Test
	void testHelloWorld() {
		assertEquals("Hello World", App.helloBoysAndGirls());
	}

	@Test
	void testJoseph() {
		assertEquals("Hello Joseph", App.helloBoysAndGirls());
	}
}
