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
public interface FractionInterface {
    int getNumerator();
    int getDenominator();
    void setNumerator(int numerator);
    boolean setDenominator(int denominator);
    FractionInterface add(FractionInterface fraction);
    FractionInterface subtract(FractionInterface fraction);
    FractionInterface multiply(FractionInterface fraction);
    FractionInterface divide(FractionInterface fraction) throws NumberFormatException;
}
