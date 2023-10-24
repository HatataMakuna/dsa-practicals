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
public class Clerk extends Employee{
    double overtimeRate;
    double overtimeHours;

    public Clerk() {

    }

    public Clerk(int id, String name, double basicSalary, double overtimeRate, double overtimeHours) {
        super(id, name, basicSalary);
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
    public double computeOvertimePay(){
        return this.overtimeHours * this.overtimeRate;
    }
    
    @Override
    public double computeMonthlyPay() {
        return super.basicSalary + computeOvertimePay();
    }
    
    @Override
    public String toString() {
        return super.toString() + "OvertimeRate= " + overtimeRate + "\nOvertimeHours= " + overtimeHours + '\n';
    }
}
