package com.tawal.demo;

import com.tawal.demo.model.Billionaire;
import com.tawal.demo.service.BillionaireService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories
public class DemoApplication {

  @Autowired
  private BillionaireService billionaireService;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/hello")
  public ResponseEntity<List<Billionaire>> hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    List<Billionaire> billionaires = billionaireService.getBillionaires();
    return new ResponseEntity<List<Billionaire>>(billionaires, HttpStatus.OK);
  }
}
