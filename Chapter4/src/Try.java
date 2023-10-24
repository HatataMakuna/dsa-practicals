/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Try <T> {
    T[] entries;
    int numberOfEntries;
    
    public void add(T entry){
        if(isFull()){
            expandArraySize();
            entries[numberOfEntries -1] = entry;
        }else{
            entries[numberOfEntries -1] = entry;
        }
    } 
    
    private boolean isFull(){
        return numberOfEntries >= entries.length;
    }
    
    private void expandArraySize(){
        T[] newArray = entries;
        entries = (T[]) new Object[newArray.length * 2];
        for (int i = 0; i < numberOfEntries; i++) {
            entries[i] = newArray[i];
        }
    }
    
    
    
}
