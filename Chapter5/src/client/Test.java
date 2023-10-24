/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.LinkedQueue;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Test {
    
    public static void main(String[] args) {
        LinkedQueue<String> test = new LinkedQueue<String>();
        test.enqueue("AAA");
        test.enqueue("BBB");
        test.enqueue("BBB");
        Iterator<String> testIterator = test.getIterator();
        System.out.println(testIterator.hasNext());
        testIterator.next();
        System.out.println(testIterator.hasNext());
        testIterator.next();
        System.out.println(testIterator.hasNext());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
         System.out.println(test.dequeue());
        System.out.println(test.isEmpty());
    }
}
