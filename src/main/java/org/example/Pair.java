package org.example;

public class Pair <T>{

    private T first;
    private T second;


    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    protected T getFirst(){
        System.out.println("Первое значение " + first);
        return first;
    }

    protected T getSecond(){
        System.out.println("Второе значение " + second);
        return second;
    }

    @Override
    public String toString() {
        System.out.println("Pair: " + first + ", " + second);
        return super.toString();

    }
}
