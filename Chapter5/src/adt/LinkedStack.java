/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author user
 */
public class LinkedStack<T> implements StackInterface<T>{
    Node topNode;
    int numberOfEntries;

    public LinkedStack() {
        clear();
    }
   
    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry);
        if(numberOfEntries > 0){
            newNode.next = topNode;
        }
        topNode = newNode;
        numberOfEntries++;
    }

    @Override
    public T pop() {
        if(!isEmpty()){
            Node popNode = topNode;
            topNode = topNode.next;
            numberOfEntries--;
            return popNode.data;
        }else{
            return null; 
        }
    }

    @Override
    public T peek() {
        if(!isEmpty()){
            return topNode.data;
        }else{
            return null; 
        }
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public void clear() {
        topNode = null;
        numberOfEntries = 0;
    }
    
    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
          this.data = data;
          this.next = null;
        }

        private Node(T data, Node next) {
          this.data = data;
          this.next = next;
        }
    }
}
