package app;

import company.Employee;

public class App {
    public static void main(String[] args){
        Employee emp = new Employee(0, "10001", "james1",200000L);
        Employee emp2 = new Employee(0, "10002", "james2",200000L);
        System.out.println(emp);
        System.out.println(emp2);
    }
}
