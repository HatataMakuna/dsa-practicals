/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author user
 */
public class CircularLinkedQueue<T> implements QueueInterface<T>{
    Node lastNode;

    public CircularLinkedQueue() {
        clear();
    }
    
    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        if(isEmpty()){
            newNode.next = newNode;
        }else{
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T result = null;
        if(!isEmpty()){
            result = lastNode.next.data;
            if(lastNode == lastNode.next){
                lastNode = null;
            }else{
                lastNode.next = lastNode.next.next;
            }
        }
        return result;
    }

    @Override
    public T getFront() {
        T result = null;
        if(!isEmpty()){
            result = lastNode.next.data;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public void clear() {
        lastNode = null;
    }
    
    @Override
    public Iterator<T> getIterator() {
        return new CircularLinkedQueueIterator();
    }
    
    private class CircularLinkedQueueIterator implements Iterator<T> {
        private Node currentNode;

        public CircularLinkedQueueIterator() {
            currentNode = lastNode.next;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
              T returnData = currentNode.data;
              currentNode = currentNode.next;
              return returnData;
            } else {
              return null;
            }
        }
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
