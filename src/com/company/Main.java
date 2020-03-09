package com.company;

public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(2, 3);
        System.out.println(fraction.convertToRealNumber() + " + " + fraction1.convertToRealNumber() + " = " +
                fraction.addition(fraction1));
        ComplexFranction complexFranction = new ComplexFranction(1,2,1,2);
        System.out.println(complexFranction.convertToRealNumber() + " " + complexFranction.addition(fraction1));
    }
}
