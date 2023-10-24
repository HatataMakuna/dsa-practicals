/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question4 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        displayBackword(array, 0, 5);
    }
    
    public static void displayBackword(Object[] array, int first, int last){
        System.out.println(array[last]);
        if(first < last){
            displayBackword(array, first, last-1);
        }
    }
}
