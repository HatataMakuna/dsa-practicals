/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author user
 */
public interface MatrixInterface {
    boolean storeValue(int row, int col, int value);
    boolean makeEmpty(int m);
    boolean add(MatrixInterface matrixB);
    boolean copy(MatrixInterface matrixB);
}
