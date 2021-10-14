package com.javalessons.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b; // Остаток от деления

        System.out.println("v= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("g= " + g);

        a += 5;
        System.out.println("New a = " + a);

        double m = 8;
        double n = 8;

        double res_one = 2 * m++;
        double res_two = 2 * ++n;

        System.out.println("m = " + res_one);
        System.out.println("n = " + res_two);
    }
}
