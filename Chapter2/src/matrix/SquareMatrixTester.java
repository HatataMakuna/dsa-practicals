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
public class SquareMatrixTester {
    public static void main(String args[]) {
        int matrix1[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int matrix2[][] = {{6,7,8,9,10},{6,7,8,9,10},{6,7,8,9,10},{6,7,8,9,10},{6,7,8,9,10}};
        SquareMatrix squareMatrix1 = new SquareMatrix(5);
        SquareMatrix squareMatrix2 = new SquareMatrix(5);
        squareMatrix1.setMatrix(matrix1);
        squareMatrix2.setMatrix(matrix2);
        System.out.println(squareMatrix1);
        System.out.println(squareMatrix2);
        System.out.println(squareMatrix1.add(squareMatrix2));
        System.out.println(squareMatrix1);
        System.out.println(squareMatrix1.copy(squareMatrix2));
        System.out.println(squareMatrix1);
        System.out.println(squareMatrix1.makeEmpty(2));
        System.out.println(squareMatrix1);
    }
}
