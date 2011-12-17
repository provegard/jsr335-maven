package com.programmaticallyspeaking.jsr335;

import java.util.Iterator;
import static java.util.Arrays.asList;

public interface Defender extends Iterable
{
  Iterator iterator() default { return asList(1, 2, 3, 4).iterator(); }
}
