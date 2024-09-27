package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;


public class AppTest {

  @Test
  public void shouldAnswerWithTrue()
  {
      boolean event1 = 2 > 3;
      assertFalse( event1 );
  }

  @Test
  void testSameObject() {
      String s1 = "abc";
      String s2 = "abc";
      assertSame(s1, s2);

      String s3 = new String("abc");
      assertNotSame(s2, s3);
  }

  @Test
  void testThrow() {
      
  }
}
