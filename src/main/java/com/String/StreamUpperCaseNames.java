package com.String;

import java.util.ArrayList;

public class StreamUpperCaseNames {
     public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("jai");
        names.add("sakthi");
        names.add("sandy");
        names.add("hari");
        names.add("mugu");
        names.add("siva");
        names.stream()

        .filter(name -> name.startWith("S") ||name.startWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);

}
}
