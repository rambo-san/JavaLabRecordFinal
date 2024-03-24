class Employee {
    public void display() {
        System.out.println("Name of class is Employee.");
    }

    public void calcSalary() {
        System.out.println("Salary of Engineer is 10000.");
    }
}

class Engineer extends Employee {
    public void calcSalary() {
        System.out.println("Salary of Engineer is 20000.");
    }
}

public class EmpMain {
    public static void main(String[] args) {
        Employee emp = new Engineer();
        emp.display();
        emp.calcSalary();
    }
}
