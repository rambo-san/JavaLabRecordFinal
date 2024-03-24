import java.util.Scanner;
class Staff {
    int code;
    String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

class Faculty extends Staff {
    String department;
    String subjectTaken;
    String researchArea;

    public Faculty(int code, String name, String department, String subjectTaken, String researchArea) {
        super(code, name);
        this.department = department;
        this.subjectTaken = subjectTaken;
        this.researchArea = researchArea;
    }
}

class Typist extends Staff {
    String office;
    int speed;

    public Typist(int code, String name, String office, int speed) {
        super(code, name);
        this.office = office;
        this.speed = speed;
    }
}

class Permanent extends Typist {
    double salary;

    public Permanent(int code, String name, String office, int speed, double salary) {
        super(code, name, office, speed);
        this.salary = salary;
    }
}

class Casual extends Typist {
    double dailyWages;

    public Casual(int code, String name, String office, int speed, double dailyWages) {
        super(code, name, office, speed);
        this.dailyWages = dailyWages;
    }
}

class Officer extends Staff {
    String rank;
    String grade;

    public Officer(int code, String name, String rank, String grade) {
        super(code, name);
        this.rank = rank;
        this.grade = grade;
    }
}

public class StaffMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String department, subjectTaken, researchArea, office, rank, grade;
            int code, speed;
            Float salary, dailyWages;
            System.out.println("Enter the details of the faculty:");
            System.out.print("Code: ");
            code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            department = scanner.nextLine();
            System.out.print("Subject Taken: ");
            subjectTaken = scanner.nextLine();
            System.out.print("Research Area: ");
            researchArea = scanner.nextLine();
            Faculty faculty = new Faculty(code, name, department, subjectTaken, researchArea);
            
            System.out.println("\nEnter the details of the permanent typist:");
            System.out.print("Code: ");
            code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Office: ");
            office = scanner.nextLine();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            System.out.print("Salary: ");
            salary = scanner.nextFloat();
            Permanent permanent = new Permanent(code, name, office, speed, salary);

            System.out.println("\nEnter the details of the casual typist:");
            System.out.print("Code: ");
            code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Office: ");
            office = scanner.nextLine();
            System.out.print("Speed: ");
            speed = scanner.nextInt();
            System.out.print("Daily Wages: ");
            dailyWages = scanner.nextFloat();
            Casual casual = new Casual(code, name, office, speed, dailyWages);

            System.out.println("\nEnter the details of the officer:");
            System.out.print("Code: ");
            code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Rank: ");
            rank = scanner.nextLine();
            System.out.print("Grade: ");
            grade = scanner.nextLine();
            Officer officer = new Officer(code, name, rank, grade);
            

            System.out.println("Faculty:");
            System.out.println("Code: " + faculty.code);
            System.out.println("Name: " + faculty.name);
            System.out.println("Department: " + faculty.department);
            System.out.println("Subject Taken: " + faculty.subjectTaken);
            System.out.println("Research Area: " + faculty.researchArea);

            System.out.println("\nPermanent Typist:");
            System.out.println("Code: " + permanent.code);
            System.out.println("Name: " + permanent.name);
            System.out.println("Office: " + permanent.office);
            System.out.println("Speed: " + permanent.speed);
            System.out.println("Salary: " + permanent.salary);

            System.out.println("\nCasual Typist:");
            System.out.println("Code: " + casual.code);
            System.out.println("Name: " + casual.name);
            System.out.println("Office: " + casual.office);
            System.out.println("Speed: " + casual.speed);
            System.out.println("Daily Wages: " + casual.dailyWages);

            System.out.println("\nOfficer:");
            System.out.println("Code: " + officer.code);
            System.out.println("Name: " + officer.name);
            System.out.println("Rank: " + officer.rank);
            System.out.println("Grade: " + officer.grade);
        }


    }
}
