package com.note.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobController {

  private int count = 0;

  @Scheduled(cron = "0/5 * * * * ?")
  public void add() {
    count++;
    System.out.println(count);
  }

}
