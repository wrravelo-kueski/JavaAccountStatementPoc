package com.javaaccountstatement.poc.utils;

import java.util.Random;

public class HexGenerator {
  public static String generateHex() {
    Random r = new Random();
    StringBuffer sb = new StringBuffer();
    int size = 32;
    while (sb.length() < size) {
      sb.append(Integer.toHexString(r.nextInt()));
    }

    return sb.toString().substring(0, size);
  } 
}
