package com.bootcamp.demo;

public class Calculator {

  // if overflow, return -1
  public static int sum(int x, int y){
    if ((long) x + (long) y > Integer.MAX_VALUE)
      return -1;
    return x + y;
  }

  public static int sub(int x, int y){
    if ((long) x - (long) y > Integer.MIN_VALUE)
      return -1;
    return x - y;
  }

  public static int mul(int x, int y){
    if ((long) x * (long) y > Integer.MAX_VALUE)
      return -1;
    return x * y;
  }

  public static int div(int x, int y){
    if ((long) x / (long) y > Integer.MIN_VALUE)
      return -1;
    return x / y;
  }

  // if all number < 0, return -1
  // if any number >= 0, return Max
  public static int findMax(int[] arr){
    int max = Integer.MIN_VALUE;
    boolean withPositiveNumber = false;
    for(int x: arr){
      if(x >= 0)
        withPositiveNumber = true;
      if(x > max)
        max = x;
    }
    return withPositiveNumber ? max: -1;
  }
}
