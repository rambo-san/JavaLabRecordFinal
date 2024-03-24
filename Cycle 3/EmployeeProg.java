import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

class Officer extends Employee {
    String specialization;
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class EmployeeProg {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the details of the officer:");
            Officer officer = new Officer();
            System.out.print("Name: ");
            officer.name = scanner.nextLine();
            System.out.print("Age: ");
            officer.age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Phone Number: ");
            officer.phoneNumber = scanner.nextLine();
            System.out.print("Address: ");
            officer.address = scanner.nextLine();
            System.out.print("Salary: ");
            officer.salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Specialization: 1 - Marketing, 2 - Sales, 3 - Technical: ");
            int specialization = scanner.nextInt();
            scanner.nextLine();
            switch (specialization) {
                case 1:
                    officer.specialization = "Marketing";
                    break;
                case 2:
                    officer.specialization = "Sales";
                    break;
                case 3:
                    officer.specialization = "Technical";
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("\nEnter the details of the manager:");
            Manager manager = new Manager();
            System.out.print("Name: ");
            manager.name = scanner.nextLine();
            System.out.print("Age: ");
            manager.age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Phone Number: ");
            manager.phoneNumber = scanner.nextLine();
            System.out.print("Address: ");
            manager.address = scanner.nextLine();
            System.out.print("Salary: ");
            manager.salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Department: ");
            manager.department = scanner.nextLine();
            System.out.println("\nOfficer Details:");
            officer.disp();
            System.out.println("\nManager Details:");
            manager.disp();

        }
        
    }
}