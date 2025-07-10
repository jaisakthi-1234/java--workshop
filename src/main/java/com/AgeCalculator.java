package com;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
           Scanner inputScanner = new Scanner(System.in);
        //    int yearofbirth = 2007;
        //    int currentyear = 2025;
        //    int age =currentyear -yearofbirth;
        //    System.out.println("Age:"+age);

     System.out.println("Enter your year of birth:(yyyy-mm-dd)");
    // int yearofbirth = inputScanner.nextInt();
    // int presentyear = LocalDate.now().getYear();
    // int age = presentyear - yearofbirth;
    // System.out.println("age:"+age);
        String  dateofBirth = inputScanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateofBirth);
        int yearofbirth = birthDate.getYear();
        int currentyear = LocalDate.now().getYear();
        int age = currentyear - yearofbirth;
        System.out.println("age:"+age);
      }

}
