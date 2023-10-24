package org.example;

public class Calculate <T extends Number> {
    private T a;
    private T b;

    Calculate(T a, T b){
        this.a = a;
        this.b = b;
    }

    /**
     * Сложение
     * @param a первое число
     * @param b второе число
     * @param <T>
     */
    protected static  <T extends Number> void sum(T a, T b){
        double res = a.doubleValue() + b.doubleValue();
        System.out.println("Sum " + res);
    }

    // умножение
    protected static <T extends Number> void multiply (T a, T b){
        double res = a.doubleValue() * b.doubleValue();
        System.out.println("Sum " + res);
    }

    // деление
    protected static <T extends Number> void divide (T a, T b){
        double res = a.doubleValue() / b.doubleValue();
        System.out.println("Sum " + res);
    }

    // вычитание
    protected static <T extends Number> void subtract (T a, T b){
        double res = a.doubleValue() - b.doubleValue();
        System.out.println("Sum " + res);
    }
}
