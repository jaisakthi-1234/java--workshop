package com;

public class StringExample {
    public static void main(String[] args) {
         String firstname = "jai";
         String lastname = "sakthi";

        String fullname=firstname + " "+ lastname;
        System.out.println(fullname.toUpperCase());

        String sentance = "this program shows how can we split into multiple string.thr long sentence eord and letter count";
        String[] word = sentance.split("\\.");
          System.out.println("Total sentence: " + sentance.length());
        String[] words = sentance.split(" ");
          System.out.println("Total chars" + words.length);
          String[] chars = sentance.split(" ");
          System.out.println("Total chars : "+ chars.length);
        
      }

}
