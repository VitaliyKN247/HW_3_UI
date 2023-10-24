package org.example;

public class Compare <T>{

    private T [] array1;
    private T [] array2;

    Compare(T [] array1, T [] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    // сравнение массивов
    protected static <T> void compareArrays(T [] array1, T [] array2){
        test(array1,array2);
        for (int i = 0; i < array1.length; i++){
            if(array1[i].equals(array2[i])){
                System.out.println("true");
            } else System.out.println("false");
        }
    }

    // проход по всем элементам массива
    protected static <T> void passThroughTheArray(T [] array){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    protected static <T> void test(T [] test, T [] test2){
        if(test == null && test2 == null){
            throw new RuntimeException("Массивы пустые");
//            System.out.println("Массивы пустые");
        }
        if (test == null || test2 == null || test.length != test2.length){
            throw new RuntimeException("Один из массивов пуст");
        }
    }
}
