/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.LinkedStack;

/**
 *
 * @author user
 */
public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> numberList = new LinkedStack<Integer>();
        numberList.push(1);
        System.out.println(numberList.peek());
        numberList.push(2);
        System.out.println(numberList.peek());
        numberList.push(3);
        System.out.println(numberList.peek() + "\n");
        
        while(!numberList.isEmpty()){
            System.out.println(numberList.pop());
        }
        
        System.out.println("\n" + numberList.peek());
        System.out.println(numberList.pop());
    }
}
