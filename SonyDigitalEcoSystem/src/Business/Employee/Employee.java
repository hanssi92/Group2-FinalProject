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
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean active;
    
    public Employee(String name) {
        this.employeeId = counter++;
        applyFullName(name);
        this.active = true;
    }

    public Employee(String firstName, String lastName, String email, String phone) {
        this.employeeId = counter++;
        this.firstName = firstName == null ? "" : firstName.trim();
        this.lastName = lastName == null ? "" : lastName.trim();
        this.email = email == null ? "" : email.trim();
        this.phone = phone == null ? "" : phone.trim();
        this.active = true;
    }

    public Employee(String firstName, String lastName, String email, String phone, boolean active) {
        this.employeeId = counter++;
        this.firstName = firstName == null ? "" : firstName.trim();
        this.lastName = lastName == null ? "" : lastName.trim();
        this.email = email == null ? "" : email.trim();
        this.phone = phone == null ? "" : phone.trim();
        this.active = active;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        String fullName = (firstName + " " + lastName).trim();
        return fullName.isEmpty() ? "Employee " + employeeId : fullName;
    }

    public String getFirstName() {
        return firstName == null ? "" : firstName;
    }

    public String getLastName() {
        return lastName == null ? "" : lastName;
    }

    public String getEmail() {
        return email == null ? "" : email;
    }

    public String getPhone() {
        return phone == null ? "" : phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        applyFullName(name);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName.trim();
    }

    public void setEmail(String email) {
        this.email = email == null ? "" : email.trim();
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? "" : phone.trim();
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private void applyFullName(String name) {
        String safeName = name == null ? "" : name.trim();
        if (safeName.isEmpty()) {
            this.firstName = "";
            this.lastName = "";
            return;
        }

        String[] parts = safeName.split("\\s+", 2);
        this.firstName = parts[0];
        this.lastName = parts.length > 1 ? parts[1] : "";
    }
}
