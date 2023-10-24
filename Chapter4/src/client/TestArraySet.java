/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.ArraySet;
import adt.Set;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class TestArraySet {
    public static void main(String args[]) {
        ArraySet<Integer> set1 = new ArraySet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        ArraySet<Integer> set2 = new ArraySet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.print("{");
        for (int i = 0; i < set1.getNumberOfElement(); i++) {
            System.out.print(set1.getElement(i));
            if(set1.getNumberOfElement() - i > 1 ){
                System.out.print(",");
            }
        }   
        System.out.print("}\n\n");
        
        
        System.out.print("{");
        for (int i = 0; i < set2.getNumberOfElement(); i++) {
            System.out.print(set2.getElement(i));
            if(set2.getNumberOfElement() - i > 1 ){
                System.out.print(",");
            }
        }   
        System.out.print("}\n\n");
        
        System.out.print(set1.checkSubset(set2));
        System.out.print("\n\n");
        
        ArraySet<Integer> intersection = new ArraySet();
        intersection = (ArraySet<Integer>)set1.intersection(set2);
        System.out.print("{");
        for (int i = 0; i < intersection.getNumberOfElement(); i++) {
            System.out.print(intersection.getElement(i));
            if(intersection.getNumberOfElement() - i > 1 ){
                System.out.print(",");
            }
        }   
        System.out.print("}\n\n");
        
        set1.union(set2);
        System.out.print("{");
        for (int i = 0; i < set1.getNumberOfElement(); i++) {
            System.out.print(set1.getElement(i));
            if(set1.getNumberOfElement() - i > 1 ){
                System.out.print(",");
            }
        }   
        System.out.print("}\n\n");
        
        Iterator<Integer> iterator = set1.getIterator();
        
        System.out.println(iterator.hasNext());
        System.out.print(iterator.next());
        System.out.print(iterator.next());
        System.out.print(iterator.next());
        System.out.print(iterator.next());
        System.out.println(iterator.next());
        
    }
}
