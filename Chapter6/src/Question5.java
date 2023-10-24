
import samplecode.SimpleList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question5 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        SimpleList<Integer> numberList = new SimpleList<>(numbers);
        System.out.println(numberList.countNodes());
    }
}
