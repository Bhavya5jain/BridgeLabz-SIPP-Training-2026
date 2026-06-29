package oops_practice.oops.gcr_codebase.Encapsulation_Abstraction.EmployeePayrollSystem;

import oops_practice.oops.gcr_codebase.Encapsulation_Abstraction.EmployeePayrollSystem.Employee;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}