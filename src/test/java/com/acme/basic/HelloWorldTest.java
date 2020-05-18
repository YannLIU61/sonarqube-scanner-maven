package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {
  
  @Test
  public void testFind() {
	  int[] a = {1,2,3,4,1,5,7};
	  int target = 1;
	  HelloWorld.searchRange(a, target);
  }
}
