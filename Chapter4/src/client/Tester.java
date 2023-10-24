/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Tester {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add(1);
        Integer j = 0;
        System.out.print(list.get(0) == list.get(1));
    }
}
