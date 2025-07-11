package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkList {
       public class Marklist {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(67);
        marks.add(92);
        marks.add(74);
        marks.add(58);

        
        Collections.sort(marks);
        System.out.println("Ascending order: " + marks);

        
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Descending order: " + marks);
    }
}
}
