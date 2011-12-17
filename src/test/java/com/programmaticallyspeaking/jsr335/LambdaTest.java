package com.programmaticallyspeaking.jsr335;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

@Test
public class LambdaTest
{
  public void testLambda()
  {
    assertEquals(Lambda.test().f(), "this is a test");
  }
}
