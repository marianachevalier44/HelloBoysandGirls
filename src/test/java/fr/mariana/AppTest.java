package fr.mariana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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

  @Test
  void testAlex() {
    assertEquals("Hello Alex", App.helloBoysAndGirls());
  }

  @Test
  void testKevin() {
    assertEquals("Hello Kévin", App.helloBoysAndGirls());
  }

  @Test
  void testElodie() {
    assertEquals("Hello Elodie", App.helloBoysAndGirls());
  }

@Test
  void testfinale() {
    assertEquals("Hello la promo on est des winners", App.helloBoysAndGirls());
  }
}
