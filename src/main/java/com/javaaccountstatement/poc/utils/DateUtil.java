package com.javaaccountstatement.poc.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
  public static Date fromString(String dateString) {
    Date convertedDate = new Date();
    try {
      DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
      convertedDate = format.parse(dateString);
    } catch(Exception e) {
      System.out.println("ERROR: Converting date error");
    }
    return convertedDate;
  }  
}
