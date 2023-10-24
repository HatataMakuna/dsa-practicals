/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question3 {
    public static void main(String[] args) {
        
    }
    
    public static int recursiveFibonacci(int n){
        if(n <= 1){
            return 1;
        }else{
            return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
        }
    }
    
    public static int iterativeFibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int sumOfPrevTwo = 0;
        if(n >=2 && n <=3){
            return 1;
        }
        for (int i = 2; i < n; i++) {
            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return sumOfPrevTwo;
    }   
}

