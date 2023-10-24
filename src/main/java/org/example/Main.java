package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // калькулирование
        new Calculate(3,4.5);
        Calculate.sum(3,4.379);
        Calculate.divide(3,4.379);
        Calculate.multiply(3,4.379);
        Calculate.subtract(3,4.379);
        System.out.println();

        // compare
        Integer [] array1 = new Integer[]{1,4,5,7};
        Integer [] array2 = new Integer[]{2,4,3,7};

        Compare.compareArrays(array1,array2);
        System.out.println();


        // pair
        Pair pair = new Pair(3.6,"test");
        pair.getFirst();
        pair.getSecond();
        System.out.println(pair);


    }

}