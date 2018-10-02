package com.note.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

  public static String getDateString(Date date) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return simpleDateFormat.format(date);
  }

  public static void main(String[] args) {
    System.out.println(getDateString(new Date()));
  }

}
