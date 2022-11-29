package com.javaaccountstatement.poc.utils;

import java.util.Random;

public class NumberGenerator {
  public static int randomInteger(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
  }

  public static int randomInteger(int max) {
    return randomInteger(1, max);
  }
}
