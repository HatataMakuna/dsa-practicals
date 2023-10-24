
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter integer number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("GCD(" + number1 + "," + number2 + ") = " + gcd(number1, number2));
    }
    
    public static int gcd(int a, int b) {
        if (b==0) 
            return a;
        return gcd(b, a%b);
    }
}
