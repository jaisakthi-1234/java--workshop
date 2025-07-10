package com.vetias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    @Test
     public void testwordCount(){
         WordCount WordCount = new WordCount();
        int count = WordCount.count("this is a java program");
        Assertions.assertEquals(10, count);
     }

     @Test
     public void testAnotherString(){
      WordCount wordCount = new WordCount();
      int count = wordCount.count("jai");
      Assertions.assertEquals(3, count);
     }

}
