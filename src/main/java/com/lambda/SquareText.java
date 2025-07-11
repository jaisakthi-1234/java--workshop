package com.lambda;

import java.beans.Transient;

public class SquareText {
   @Test
     public void testsquare(){
        Square square = (int x) -> x*x;
        Assertions.assertEquals(36,square.findSquare(5));
     }


}
