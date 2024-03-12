package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(100, "id01", "james", 200000);

        long sal = emp.getSalary(); // JVM이 어떻게 동작했을지
        long annsal = emp.getAnnSalary(); // JVM이 어떻게 동작했을지

        System.out.println(emp.toString());
    }
}
