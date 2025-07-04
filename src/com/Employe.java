package com;

import java.util.Arrays;

public class Employe {
    public static void main(String[]args){
        String[][] employes= new String [10][2];
        employes [0][0]="jai";
        employes [0][1]="20000";
        employes[1][0]="sakthi";
        employes [1][1]="30000";
        employes [2][0]="hari";
        employes [2][1]="40000";
        for (String[] employe : employes) {
            System.out.println(Arrays.toString(employe));
        }

    }
}
