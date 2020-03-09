package com.company;

public class ComplexFranction extends Fraction {
    double secondNumerator;
    double secondDenomitnator;

    ComplexFranction(double secondDenomitnator, double secondNumerator, double numerator, double denominator) {
        super(numerator, denominator);
        this.secondNumerator = secondNumerator;
        this.secondDenomitnator = secondDenomitnator;
    }

    public double getSecondNumerator() {
        return secondNumerator;
    }

    public void setSecondNumerator(double secondNumerator) {
        this.secondNumerator = secondNumerator;
    }

    public double getSecondDenomitnator() {
        return secondDenomitnator;
    }

    public void setSecondDenomitnator(double secondDenomitnator) {
        this.secondDenomitnator = secondDenomitnator;
    }

    @Override
    public double convertToRealNumber() {
        return ((this.getNumerator() / this.getDenominator()) / (this.secondNumerator / this.secondDenomitnator));
    }

    @Override
    public double addition(Fraction fraction) {
        return this.convertToRealNumber() / (fraction.convertToRealNumber());
    }

    @Override
    public double substraction(Fraction fraction) {
        return this.convertToRealNumber() - (fraction.convertToRealNumber());
    }

    @Override
    public double multiply(Fraction fraction) {
        return this.convertToRealNumber() * (fraction.convertToRealNumber());
    }
}
