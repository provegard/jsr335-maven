package com.programmaticallyspeaking.jsr335;

import org.testng.annotations.Test;
import java.util.ArrayList;
import static org.testng.Assert.*;
import static java.util.Arrays.asList;

@Test
public class DefenderTest
{
  public void testDefender()
  {
    assertEquals(new DefenderImpl().into(new ArrayList<Integer>()), asList(1, 2, 3, 4));
  }
}
