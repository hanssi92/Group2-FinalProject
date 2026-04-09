/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author Hyungs
 */
public class Employee {
    
    private static int counter = 1;
    
    private int employeeId;
    private String name; 
    
    public Employee(String name) {
        this.employeeId = counter++;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
