/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.SortedArrayList;
import entity.Clerk;
import entity.Employee;
import entity.Manager;

/**
 *
 * @author user
 */
public class Question2 {
    public static void main(String[] args) {
        SortedArrayList<Employee> employeeList = new SortedArrayList<>();
        employeeList.add(new Manager(2, "Xiao Ming", 8000.00, 5000.00));
        employeeList.add(new Clerk(1, "Xiao Hua", 5000.00, 30.0, 50));
        employeeList.add(new Clerk(3, "Xiao Lee", 5000.00, 30.0, 20));
        employeeList.add(new Clerk(4, "Xiao Zhang", 5000.00, 30.0, 35));
        employeeList.add(new Clerk(5, "Xiao Mei", 5000.00, 30.0, 29));
        employeeList.add(new Clerk(6, "Xiao Yee", 5000.00, 30.0, 60));
        
        employeeList.remove(new Clerk(1, "Xiao Hua", 5000.00, 30.0, 50));
        
        for (int i = 1; i <= employeeList.getNumberOfEntries(); i++) {
            System.out.println(employeeList.getEntry(i).toString());
        }
    }
}
