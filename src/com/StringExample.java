package com;

public class StringExample {
    public static void main(String[] args) {
         String firstname = "jai";
         String lastname = "sakthi";

        String fullname=firstname + " "+ lastname;
        System.out.println(fullname.toUpperCase());

        String sentance = "this program shows how can we split into multiple string .thelong sentence eord and letter count";
        String[] words = sentance.split("");
          System.out.println(words.length);
        String dot[] = sentance.split("\\. ");
        System.out.println(dot.length);
        System.out.println(sentance.length());
        
      }

}
