/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.CircularLinkedQueue;
import adt.QueueInterface;

/**
 *
 * @author user
 */
public class TestCircularLinkedQueue {
    public static void main(String[] args) {
        QueueInterface<String> customerQueue = new CircularLinkedQueue<String>();
        customerQueue.enqueue("Ali");
        customerQueue.enqueue("Jack");
        customerQueue.enqueue("Xiao Ming");
        customerQueue.enqueue("Mei Mei");
        customerQueue.enqueue("Michael");
        
        while (!customerQueue.isEmpty()) {
            System.out.println(customerQueue.getFront());
            System.out.println(customerQueue.dequeue() + "\n");
        }
        
    }
}
