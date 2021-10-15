package com.javalessons.contrlolstatement;

public class Control {
    public static void main(String[] args) {
        int testScore = 50;
        System.out.println("You have got");
        if (testScore >= 90) {
            System.out.println("a excellent");
        } else if (testScore >= 75) {
            System.out.println("a good");
        } else if (testScore >= 60) {
            System.out.println("a satisfactory");
        }
        System.out.println("mark");
    }
}
