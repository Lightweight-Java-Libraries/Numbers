package org.lwjl.numbers;

public class Main {

    public static void main(String[] args) {
        Number<Float> floatNumber = new Number<>(10.f);
        Number<Double> doubleNumber = new Number<>(10.d);
        System.out.println(floatNumber);

        System.out.println(floatNumber.hashCode());
        System.out.println(doubleNumber.hashCode());
    }

}