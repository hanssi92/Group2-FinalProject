/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name) {
        Employee employee = new Employee(name);
        employeeList.add(employee);
        return employee;
    }

    public Employee createEmployee(String firstName, String lastName, String email, String phone, boolean active) {
        Employee employee = new Employee(firstName, lastName, email, phone, active);
        employeeList.add(employee);
        return employee;
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employeeList.contains(employee)) {
            employeeList.add(employee);
        }
    }

    public boolean removeEmployee(Employee employee) {
        return employeeList.remove(employee);
    }
}
