/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.SortedLinkedList;
import entity.Clerk;
import entity.Employee;
import entity.Manager;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Question4 {
    public static void main(String[] args) {
        SortedLinkedList<Employee> employeeList = new SortedLinkedList<>();
        employeeList.add(new Manager(1111, "Xiao Ming", 8000.00, 5000.00));
        employeeList.add(new Clerk(2222, "Xiao Hua", 5000.00, 30.0, 50));
        employeeList.add(new Clerk(3333, "Xiao Lee", 5000.00, 30.0, 20));
        employeeList.add(new Clerk(4444, "Xiao Zhang", 5000.00, 30.0, 35));
        employeeList.add(new Clerk(5555, "Xiao Mei", 5000.00, 30.0, 29));
        employeeList.add(new Clerk(6666, "Xiao Yee", 5000.00, 30.0, 60));
        Iterator<Employee> iterator = employeeList.getIterator();
        System.out.println(String.format("%-8s%-20s%12s", "EmpID", "Employee Name", "Salary (RM)"));
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(String.format("%-8s%-20s%11.2f", employee.getId(), employee.getName(), employee.computeMonthlyPay()));
        }
    }
}
