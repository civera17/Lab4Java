package com.company;

public class Fraction {
    private double numerator;
    private double denominator;

    Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double addition(Fraction fraction) {
        return (this.convertToRealNumber() + fraction.convertToRealNumber());
    }

    public double addition(double nr) {
        return this.convertToRealNumber() + nr;
    }

    public double convertToRealNumber() {
        return this.numerator / this.denominator;
    }

    public double substraction(Fraction fraction) {
        return (this.convertToRealNumber() - fraction.convertToRealNumber());
    }

    public double substraction(double nr) {
        return this.convertToRealNumber() - nr;
    }

    public double multiply(Fraction fraction) {
        return (this.convertToRealNumber() * fraction.convertToRealNumber());
    }

    public double multiply(double nr) {
        return this.convertToRealNumber() * nr;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
