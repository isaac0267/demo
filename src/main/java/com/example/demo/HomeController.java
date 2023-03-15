package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
  public String index() {
   return "Pace to the world";
  }
  public static double bill(double taxRate, double maelListe) {
     double tax=taxRate*maelListe;
     double result=maelListe+tax;
      System.out.println("The result is "+" "+ result);
      return result;
  }

    public static void main(String[] args) {
        bill(.02, 120);
    }
}
