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
 * @param <T>
 */
public interface Set<T> {
    boolean add(T newElement);
    boolean remove(T anElement) ;
    boolean checkSubset(Set<T> anotherSet) ;
    void union(Set<T> anotherSet);
    Set intersection(Set<T> anotherSet);
    boolean isEmpty();
    public Iterator<T> getIterator();
}
