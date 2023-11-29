public class Main {
    public static void main(String[] args) {

        var employee = new Employee();
        // var is used in place of coding out Employee to
        // improve readability and conciseness
        employee.baseSalary = 50_000;
        // 50_000 is passed to the baseSalary field for this Employee object
        employee.hourlyRate = 20;
        // 20 is passed to the hourlyRate field for this Employee object
        int wage = employee.calculateWage(10);
        // 10 is passed as an argument to method call


        System.out.println(wage);
    }
}