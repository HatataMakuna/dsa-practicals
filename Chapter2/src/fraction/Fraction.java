/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author user
 */
public class Fraction implements FractionInterface{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) throws NumberFormatException{
        if(denominator == 0){
            throw new NumberFormatException("The value of denominator cannot be 0");
        }else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public boolean setDenominator(int denominator) {
        if(denominator == 0){
            return false;
        }else{
            this.denominator = denominator;
            return true;
        }
    }

    @Override
    public FractionInterface add(FractionInterface fraction2) {
        //a / b + c / d = (ad + bc) / bd
        int a = numerator;
        int b = denominator;
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();    
        int resultNumerator = (a * d) + (b * c);
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public FractionInterface subtract(FractionInterface fraction2) {
        //a / b - c / d = (ad - bc) / bd
        int a = numerator;
        int b = denominator;
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();    
        int resultNumerator = (a * d - b * c);
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public FractionInterface multiply(FractionInterface fraction2) {
        //(a / b) x (c / d) = ac / bd
        int a = numerator;
        int b = denominator;
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();    
        int resultNumerator = a * c;
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public FractionInterface divide(FractionInterface fraction2) throws NumberFormatException{
        //(a / b) / (c / d) = ad / bc, where c / d ≠  0
        int a = numerator;
        int b = denominator;
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();
        if((double)c / d == 0){
            throw new NumberFormatException("Second fraction's result cannot be 0");
        }
        int resultNumerator = a * d;
        int resultDenominator = b * c;
        return new Fraction(resultNumerator, resultDenominator);
    }
    
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public String toSimplestForm(){
        int gcd = gcd(numerator, denominator);
        return (numerator / gcd) + "/" + (denominator / gcd);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    
}
