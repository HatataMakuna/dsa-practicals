
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
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer number : ");
        int number = scanner.nextInt();
        System.out.println("countUp(" + number + "): ");
        countUp(number);
    }
    
    public static void countUp(int number){
        if(number > 0){
            countUp(number - 1);
            System.out.println(number);
        }
    }
}
