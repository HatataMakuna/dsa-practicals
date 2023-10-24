/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Employee implements Comparable<Employee>{
    int id;
    String name;
    double basicSalary;

    public Employee(){
        
    }
    
    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public double computeMonthlyPay(){
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Id= " + id + "\nName= " + name + "\nBasicSalary= " + basicSalary + '\n';
    }
    
    @Override
    public int compareTo(Employee employee) {
        if(this.id < employee.id){
            return -1;
        }else if(this.id == employee.id){
            return 0;
        }else{
            return 1;
        }
    }  
}
