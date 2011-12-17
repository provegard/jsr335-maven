package com.programmaticallyspeaking.jsr335;

import java.util.Iterator;
import static java.util.Arrays.asList;

public class Lambda
{
  public static Func<String> test()
  {
    return () -> "this is a test";
  }

  public static interface Func<T>
  {
    T f();
  }
}
