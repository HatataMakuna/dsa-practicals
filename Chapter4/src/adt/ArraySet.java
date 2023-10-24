/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.io.Serializable;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class ArraySet<T> implements Set<T>, Serializable{
    private T[] arrayElement;
    private int numberOfElement;
    private static final int DEFAULT_CAPACITY = 100;

    public ArraySet(){
        this(DEFAULT_CAPACITY);
    }
    
    public ArraySet(int capacity) {
        arrayElement = (T[])new Object[capacity];
    }

    public int getNumberOfElement() {
        return numberOfElement;
    }
    
    public T getElement(int index){
        if(index >=0 && index <= numberOfElement-1){
            return arrayElement[index];
        }else{
            return null;
        }
    }

    @Override
    public boolean add(T newElement) {
        if(numberOfElement < arrayElement.length){
            for (int i = 0; i < numberOfElement; i++) {
                if(contain(newElement)){
                    return false;
                }
            }
            arrayElement[numberOfElement] = newElement;
            numberOfElement+=1;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean remove(T anElement) {
        for (int i = 0; i < numberOfElement; i++) {
            if(arrayElement[i] == anElement){
                arrayElement[i] = null;
                removeGap(i);
                numberOfElement--;
            }
        }
        return false;
    }

    @Override
    public boolean checkSubset(Set anotherSet) {
        ArraySet<T> anotherSet2 = (ArraySet<T>) anotherSet;
        int sameElement = 0;
        if(numberOfElement >= anotherSet2.getNumberOfElement()){
            for (int i = 0; i < numberOfElement; i++) {
                for (int j = 0; j < 10; j++) {
                    if(arrayElement[i] == anotherSet2.getElement(j)){
                        sameElement++;
                    }
                }
            }
        }else{
            return false;
        }
        
        if(sameElement == anotherSet2.getNumberOfElement()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void union(Set<T> anotherSet) {
        ArraySet<T> anotherSet2 = (ArraySet<T>) anotherSet;
        for (int i = 0; i < anotherSet2.getNumberOfElement(); i++) {
            add(anotherSet2.getElement(i));
        }
    }

    @Override
    public Set intersection(Set<T> anotherSet) {
        ArraySet<T> anotherSet2 = (ArraySet<T>) anotherSet;
        ArraySet<T> intersectionSet = new ArraySet<T>();
        for (int i = 0; i < numberOfElement; i++) {
            for (int j = 0; j < 10; j++) {
                if(arrayElement[i] == anotherSet2.getElement(j)){
                    intersectionSet.add(arrayElement[i]);
                }
            }
        }
        return intersectionSet;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElement == 0;
    }
    
    private boolean contain(T element){
        for (int i = 0; i < numberOfElement; i++) {
            if(arrayElement[i] == element){
                return true;
            }
        }
        return false;
    } 
    
    private void removeGap(int gapPosition){
        for (int i = gapPosition; i < numberOfElement; i++) {
            arrayElement[i] = arrayElement[i+1];
        }
        arrayElement[numberOfElement-1] = null;
    }

    @Override
    public Iterator<T> getIterator() {
        return new ArraySetIterator();
    }
    
    private class ArraySetIterator implements Iterator<T> {
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return nextIndex < numberOfElement - 1; 
        }

        @Override
        public T next() {
            if(hasNext() && numberOfElement > 0){
                T nextElement = arrayElement[nextIndex];
                nextIndex+=1;
                return nextElement;
            }else{
                return null;
            }
        }
    
    }

    
    
}
