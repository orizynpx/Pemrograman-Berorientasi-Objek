package Meeting4;

import java.util.Scanner;

public class Account {
    // Attributes
    int balance;
    String name;
    String pinNumber;

    // Constructor
    public Account(int balance, String name, String pinNumber) {
        this.balance = balance;
        this.name = name;
        this.pinNumber = pinNumber;
    }

    // Methods
    public int getBalance() {
        return balance;
    }

    public void increaseBalance(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pinNumber = sc.nextLine();

        if (pinNumber.equals(this.pinNumber)) {
            this.balance += balance;
        }
        else {
            System.out.println("Invalid PIN");
        }
    }

    public void decreaseBalance(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pinNumber = sc.nextLine();

        if (pinNumber.equals(this.pinNumber)) {
            if (this.balance < balance) {
                System.out.println("Balance can't be negative");
            } else {
                this.balance -= balance;
            }
        }
        else {
            System.out.println("Invalid PIN");
        }
    }

    public void setName(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pinNumber = sc.nextLine();

        if (pinNumber.equals(this.pinNumber)) {
            this.name = name;
        }
        else {
            System.out.println("Invalid PIN");
        }
    }
}