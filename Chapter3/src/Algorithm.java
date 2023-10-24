/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Algorithm {
    public static void AlgorithmA(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + 1;
        }
        
    }
    
    public static void AlgorithmB(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum = sum + 1;
            }
        }
    }
    
    public static void AlgorithmC(int n){
        int sum = n * (n + 1) / 2;
    } 
}
