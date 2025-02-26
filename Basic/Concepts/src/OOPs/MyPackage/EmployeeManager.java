// Define the Employee class with proper access modifiers, constructors, and methods
class Employee {
    // Private fields
    private int ph = 0; // Employee phone number
    private String name;
    private int basicSal = 20000; // Basic salary
    private int incentive = 200; // Incentive amount

    // Default constructor
    public Employee() {
        this.ph = 2222; // Default phone number
        this.name = "Vicky"; // Default name
    }

    // Parameterized constructor
    public Employee(String empName, int phoneNo) {
        this.ph = phoneNo;
        this.name = empName;
    }

    // Getter for phone number
    public int getPh() {
        return ph;
    }

    // Setter for phone number
    public void setPh(int phone) {
        this.ph = phone;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to calculate and print the total salary
    public void countSalaries() {
        System.out.println("Total Salary: " + (basicSal + incentive));
    }
}

// Define the MyClass class in the MyPackage2 package (simulated here for simplicity)
class MyClass {
    // Method to demonstrate functionality
    public void print() {
        System.out.println("Hello from MyClass!");
    }
}

// Main Test class
public class EmployeeManager {
    public static void main(String[] args) {
        // Create an Employee object using the default constructor
        Employee engineer = new Employee();

        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        // Call the print method of MyClass
        myClass.print();

        // Display employee details using getters
        System.out.println("Phone: " + engineer.getPh());
        System.out.println("Name: " + engineer.getName());

        // Calculate and display total salary
        engineer.countSalaries();

        // Modify employee details using setters
        engineer.setPh(987654321);
        engineer.setName("John Doe");

        // Display updated employee details
        System.out.println("Updated Phone: " + engineer.getPh());
        System.out.println("Updated Name: " + engineer.getName());
    }
}
