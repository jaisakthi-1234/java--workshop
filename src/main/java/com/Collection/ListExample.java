package com.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
      public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("jai");
        names.add("sakthi");
        names.add("sandy");
        names.add("hari");
        names.add("mugu");
        names.add("siva");

        // System.out.println(names);
        // names.set(1, "krishan");
        // for(int i = 0;i< names.size();i++){
        //     System.out.println(names.get(i));

        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
        }

      }

