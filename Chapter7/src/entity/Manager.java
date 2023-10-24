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
public class Manager extends Employee{
    double allowance;

    public Manager(){
        
    }
    
    public Manager(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    @Override
    public double computeMonthlyPay() {
        return super.basicSalary + this.allowance;
    }

    @Override
    public String toString() {
        return super.toString() + "Allowance= " + allowance + '\n';
    }
    
}
