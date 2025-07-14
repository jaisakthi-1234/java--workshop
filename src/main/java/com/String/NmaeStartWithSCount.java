package com.String;
`
import java.util.List;

public class NmaeStartWithSCount {
    public static void main(String[] args) {

         List<String>names = new ArrayList<>();
        names.add("jai");
        names.add("sakthi");
        names.add("sandy");
        names.add("hari");
        names.add("mugu");
        names.add("siva");
        

        long nameCount =names.stream()
        .filter(name -> name.startsWith("s")).count();
    
        System.out.println(nameCount);

    }

}


