package com.validation.main;

import com.validation.model.Employee;

public class TestValidation {

    public static void main(String[] args) {

        try {
            Employee emp = new Employee(25, "IT");
            emp.display();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
