public class Employee {
    public int baseSalary;
    // field for the employee's base salary
    public int hourlyRate;
    // field for the employee's hourly rate

    public int calculateWage(int extraHours){
        // extraHours wasn't hard coded because the value may change
        // month to month, so it will be passed during the method call
        return baseSalary + (hourlyRate * extraHours);
    }
}
