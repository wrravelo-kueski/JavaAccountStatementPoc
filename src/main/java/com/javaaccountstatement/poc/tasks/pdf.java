package com.javaaccountstatement.poc.tasks;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class pdf implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {    
    if (!(args.length > 0 && args[0].equals("benchmark"))) return;

    System.out.println("Clasicazou");
  }
}
