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
public class SquareMatrix implements MatrixInterface{
    int dimension;
    int[][] matrix;
    
    public SquareMatrix(int n) {
        dimension = n;
        matrix = new int[dimension][dimension];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public int getDimension() {
        return dimension;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public boolean setMatrix(int[][] matrix) {
        if(matrix.length != dimension){
            return false;
        }else{
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[i].length != dimension){
                    return false;
                }
            }
            this.matrix = matrix;
            return true;
        }
    }
    
    @Override
    public boolean storeValue(int row, int col, int value) {
        if(row > dimension || col > dimension){
            return false;
        }else{
            matrix[row - 1][col - 1] = value;
            return true;
        }
    }

    @Override
    public boolean makeEmpty(int m) {
        if(m > dimension || m <= 0){
            return false;
        }else{
            for (int i = 0; i < dimension; i++) {
                matrix[m-1][i] = 0;
                matrix[i][m-1] = 0;
            }
            return true;
        }
    }

    @Override
    public boolean add(MatrixInterface matrixB) {
        SquareMatrix squareMatrixB = (SquareMatrix)matrixB;
        if(squareMatrixB.dimension != dimension){
            return false;
        }else{
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] += squareMatrixB.getMatrix()[i][j];
                }
            }
            return true;
        }
    }

    @Override
    public boolean copy(MatrixInterface matrixB) {
        SquareMatrix squareMatrixB = (SquareMatrix)matrixB;
        if(squareMatrixB.dimension != dimension){
            return false;
        }else{
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = squareMatrixB.getMatrix()[i][j];
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        String matrixDisplayed = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixDisplayed += matrix[i][j] + "  ";
            }
            matrixDisplayed += "\n";
        }
        return matrixDisplayed;
    }
    
    
}
