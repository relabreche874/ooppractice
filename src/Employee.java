public class Employee {
    // a class for defining an employee

    public static int numberOfEmployees;
    // static members (fields/methods)
    // are used to represent a concept
    // that should be in a single place
    private int baseSalary;
    // field for the employee's base salary
    private int hourlyRate;
    // field for the employee's hourly rate

    public Employee(int baseSalary){
        // Employee constructor
        // constructors initialize objects
        this(baseSalary,0);
        // ^^ references the second constructor
    }
    public Employee(int baseSalary, int hourlyRate){
        // overloaded constructor
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
        // increments the number of employees
        // each time an employee object is created
    }

    public static void printNumberOfEmployees(){
        System.out.println(Employee.numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        // a method for calculating an employee's wage

        // extraHours wasn't hard coded because the value may change
        // month to month, so it will be passed during the method call
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        // a method overload which allows for a method to
        // make one or more parameters optional
        // use sparingly
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() { return baseSalary; }

    private int getHourlyRate() { return hourlyRate; }
}
