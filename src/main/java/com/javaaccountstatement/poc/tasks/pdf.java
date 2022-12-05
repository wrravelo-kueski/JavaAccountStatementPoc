package com.javaaccountstatement.poc.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javaaccountstatement.poc.exporters.PdfExporter;
import com.javaaccountstatement.poc.models.FinanceProduct;
import com.javaaccountstatement.poc.models.Transaction;
import com.javaaccountstatement.poc.models.User;
import com.javaaccountstatement.poc.repositories.FinanceProductRepository;
import com.javaaccountstatement.poc.repositories.TransactionRepository;
import com.javaaccountstatement.poc.repositories.UserRepository;
import com.javaaccountstatement.poc.utils.DateUtil;

@Component
public class pdf implements CommandLineRunner {

  @Autowired
  FinanceProductRepository finRep;

  @Autowired
  TransactionRepository tranRep;

  @Autowired
  UserRepository usrRep;

  @Override
  public void run(String... args) throws Exception {    
    if (!(args.length > 0 && args[0].equals("benchmark"))) return;
    List<Double> times = new ArrayList<Double>();
    List<FinanceProduct> products = finRep.findAll();

    long startTime = 0;
    long endTime = 0;
    double result = 0;
    for(int i = 0; i < products.size(); i++) {
      startTime = System.nanoTime();
      FinanceProduct product = products.get(i);
      User user = usrRep.findById(product.getUser_id()).orElseThrow();
      List<Transaction> trans = tranRep
          .findByFinanceProductIdAndCreationDateGreaterThanEqualAndCreationDateLessThanEqual(
              product.getId(), DateUtil.fromString("2022-11-29"), DateUtil.fromString("2022-11-30"));
      PdfExporter x = new PdfExporter(user, product, trans);
      x.write();
      endTime = System.nanoTime();
      result = (endTime - startTime) / 1000000000.0;
      times.add(result);

      System.out.println(i + "");
    }
    System.out.println("RESULT AVG: " + average(times));
    System.out.println("RESULT MAX: " + max(times));
    System.out.println("RESULT MIN: " + min(times));
    System.exit(0);
  }
  
  private double average(List<Double> times) {
    double sum = 0.0;
    for(int i = 0; i < times.size(); i++) {
      sum += times.get(i);
    }
    return sum / times.size();
  }

  private double max(List<Double> times) {
    double max = 0.0;
    for (int i = 0; i < times.size(); i++) {
      if(times.get(i) > max) {
        max = times.get(i);
      }
    }
    return max;
  }

  private double min(List<Double> times) {
    double min = Double.POSITIVE_INFINITY;
    for (int i = 0; i < times.size(); i++) {
      if (times.get(i) < min) {
        min = times.get(i);
      }
    }
    return min;
  }
}
