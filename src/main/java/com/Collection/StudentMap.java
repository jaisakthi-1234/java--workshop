package com.Collection;

import java.util.Map;

public class StudentMap {
     private static final int Hashmap = 0;

     public static void main(String[] args) {
        Map<Integer,String> students = new java.util.HashMap<>();
        students.put(1001,"sakthi" );
        students.put(1002,"siva" );
        students.put(1003,"sandy" );
        students.put(1004,"mugu" );
        students.put(1005,"sakthi" );

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

     }
}
