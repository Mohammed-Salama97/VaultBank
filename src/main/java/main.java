package main;

import customer.Company;
import customer.Customer;
import customer.Individual;
import employee.BankEmployee;

public class main {
    public static void main(String[] args) {
        Customer indiv = new Individual();
        Customer com = new Company();
        BankEmployee emp = new BankEmployee();
        BankEmployee emp1 = new BankEmployee();

        emp.name = "mohammed";
        emp1.name = "mohammed";
        System.out.println(emp.name);
        System.out.println(emp.name);
        System.out.println(emp.name);

    }
}
