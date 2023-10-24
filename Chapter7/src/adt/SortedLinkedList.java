package adt;

import adt.SortedListInterface;
import java.util.Iterator;

public class SortedLinkedList<T extends Comparable<T>> implements SortedListInterface<T> {

    private Node firstNode;
    private int numberOfEntries;

    public SortedLinkedList() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);

        Node nodeBefore = null;
        Node currentNode = firstNode;
        while (currentNode != null && newEntry.compareTo(currentNode.data) > 0) {
            nodeBefore = currentNode;
            currentNode = currentNode.next;
        }

        if (isEmpty() || (nodeBefore == null)) { // CASE 1: add at beginning
            newNode.next = firstNode;
            firstNode = newNode;
        } else {	// CASE 2: add in the middle or at the end, i.e. after nodeBefore
            newNode.next = currentNode;
            nodeBefore.next = newNode;
        }
        numberOfEntries++;
        return true;
    }

    public boolean remove(T anEntry) {
        Node currentNode = firstNode;
        Node beforeNode = null;
        boolean success = false;
        while(currentNode != null && anEntry.compareTo(currentNode.data) >= 0){
            if (anEntry.compareTo(currentNode.data) == 0){
                if(beforeNode == null){
                    firstNode = firstNode.next;
                }else{
                    beforeNode.next = currentNode.next;
                }
                success = true;
            }
            beforeNode = currentNode;
            currentNode = currentNode.next;
        }
        return success;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node tempNode = firstNode;

        while (!found && (tempNode != null)) {
            if (anEntry.compareTo(tempNode.data) <= 0) {
                found = true;
            }else {
                tempNode = tempNode.next;
            }
        }
        if (tempNode != null && tempNode.data.equals(anEntry)) {
            return true;
        } else {
            return false;
        }
    }

    public final void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";;
            currentNode = currentNode.next;
        }
        return outputStr;
    }
    
    public Iterator<T> getIterator() {
        return new SortedLinkedListIterator();
    }
    
    private class SortedLinkedListIterator implements Iterator<T>{
        private Node currentNode;

        public SortedLinkedListIterator() {
          currentNode = firstNode;
        }
        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if(!isEmpty()){
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }else{
                return null;
            }
        }
        
    }

    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
