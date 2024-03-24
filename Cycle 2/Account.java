import java.util.Scanner;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private String address;
    private String accountType;
    private double balance;

    // First constructor
    public Account(String accountHolderName, int accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Second constructor
    public Account(String accountHolderName, int accountNumber, String address, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account holder name, account number and initial amount");
        String accountHolderName = s.next();
        int accountNumber = s.nextInt();
        double initialAmount = s.nextDouble();
        Account account1 = new Account(accountHolderName, accountNumber, initialAmount);
        System.out.println("Enter the account holder name, account number, address, account type and balance");
        accountHolderName = s.next();
        accountNumber = s.nextInt();
        String address = s.next();
        String accountType = s.next();
        double balance = s.nextDouble();
        Account account2 = new Account(accountHolderName, accountNumber, address, accountType, balance);
        System.out.println("Enter the amount to be deposited in account 1");
        double amount = s.nextDouble();
        account1.deposit(amount);
        System.out.println("Enter the amount to be withdrawn from account 2");
        amount = s.nextDouble();
        account2.withdraw(amount);
        System.out.println("Account 1 details:");
        account1.display();
        System.out.println("Account 2 details:");
        account2.display();
        s.close();

    }
}