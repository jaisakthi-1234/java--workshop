package com.array;


import java.util.Arrays;

public class Arraystream {
 
      public static void main(String[] args) {
          int[]marks = {10,20,30,40,50};
          long numberofsubjectspassed =Arrays.stream(marks)
          .filter(mark->mark>30)
                .count();
          System.out.println(numberofsubjectspassed);


      }
}


