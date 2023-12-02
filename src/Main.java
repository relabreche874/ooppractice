public class Main {
    public static void main(String[] args) {

        var employee = new Employee(
                50_000, 20);
        // var is used in place of coding out Employee to
        // improve readability and conciseness
        var employee2 = new Employee(20_000);
        // this object only requires 1 argument passed
        // instead of 2

        int wage = employee.calculateWage(10);
        // 10 is passed as an argument to method call

        // * removed the calculateWage method from the main class
        // * as well as the baseSalary, hourlyRate, and extraHours
        // * variables from the main method


        System.out.println(wage);
    }
}