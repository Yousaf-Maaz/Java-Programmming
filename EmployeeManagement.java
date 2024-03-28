// Imagine you are working on a project for a company that wants to manage their employees
// data. Your task is to create a program that can handle different types of employees such as
// hourly employees and salaried employees. Each employee has a name, and a salary.
// To achieve this task, you need to create a class hierarchy that uses inheritance to represent
// the different types of employees. You should start by creating a base class called
// "Employee" that contains common attributes (“Employee name”) and methods
// (constructor, getters, setters, and calcSalary()) for all types of employees.
// Next, create derived classes for each type of employee (HourlyEmployee and
// SalariedEmployee), which inherit from the base class. These derived classes should include
// additional attributes and methods that are specific to each type of employee.
// For example, the HourlyEmployee class might have attributes for its hourly rate and hours
// worked, while the SalariedEmployee class might have an attribute for its annual salary.
// Each derived class should also have a constructor that initializes its specific attributes and
// calls the base class constructor.
// Finally, you should override the method "calcSalary()" for each derived class. The
// "calcSalary()" method should calculate the salary for each type of employee based on its
// specific attributes.
// For Hourly Employee salary calculation:
// Salary= no of hours worked * hourly rate
// For Salaried Employee salary calculation:
// Salary= annual salary/12
// To test your program, you should create one instance of each type of employee and call the
// "calcSalary()" method to ensure that your program is working correctly.
// Note: Input the employee data from user in main and pass them to the constructor. The
// salary will be calculated based on the info user has entered.





import java.util.Scanner;
// Base class Employee
class Employee {
    // Common attribute for all types of employees
    private String name;
    
    // Constructor
    public Employee(String name) {
        this.name = name;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Method to calculate salary (to be overridden by derived classes)
    public double calcSalary() {
        return 0.0;
    }
}

// Derived class for Hourly Employee
class HourlyEmployee extends Employee {
    // Additional attributes for HourlyEmployee
    private double hourlyRate;
    private double hoursWorked;
    
    // Constructor
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    // Method to calculate salary (override)
    @Override
    public double calcSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Derived class for Salaried Employee
class SalariedEmployee extends Employee {
    // Additional attribute for SalariedEmployee
    private double annualSalary;
    
    // Constructor
    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }
    
    // Method to calculate salary (override)
    @Override
    public double calcSalary() {
        return annualSalary / 12;
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data for Hourly Employee
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter name of Hourly Employee:");
        String hourlyName = scanner.nextLine();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter hourly rate:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter hours worked:");
        double hoursWorked = scanner.nextDouble();
        
        // Create Hourly Employee object
        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyName, hourlyRate, hoursWorked);
        
        // Input data for Salaried Employee
        scanner.nextLine(); 
        System.out.println("------------------------------------------------------\n");
        System.out.println("\nEnter name of Salaried Employee:");
        String salariedName = scanner.nextLine();
        System.out.println("------------------------------------------------------\n");
        System.out.println("Enter annual salary:");
        double annualSalary = scanner.nextDouble();
        
        // Create Salaried Employee object
        SalariedEmployee salariedEmployee = new SalariedEmployee(salariedName, annualSalary);
        
        // Calculate and display salaries
        System.out.println("------------------------------------------------------\n");
        System.out.println("\nSalary of " + hourlyEmployee.getName() + " (Hourly Employee): $" + hourlyEmployee.calcSalary());
        System.out.println("Salary of " + salariedEmployee.getName() + " (Salaried Employee): $" + salariedEmployee.calcSalary());
        System.out.println("------------------------------------------------------\n");
        scanner.close();
    }
}
