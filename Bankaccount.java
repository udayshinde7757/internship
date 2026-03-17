import java.util.Scanner;

public class Bankaccount {
    static double balance = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            System.out.println("1.create account:");
            System.out.println("2.deposit:");
            System.out.println("3.withdraw:");
            System.out.println("4.balance checking:");
            System.out.println("5.Exit:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter your name:");
                    String name = sc.nextLine();

                    System.out.println("enter your account number:");
                    String accnumber = sc.nextLine();

                    System.out.println("enter your balance:");
                    balance = sc.nextDouble();

                    createaccount(name, accnumber, balance);
                    break;

                case 2:
                    System.out.println("enter amount to deposit:");
                    double amount = sc.nextDouble();
                    deposit(amount);
                    break;

                case 3:
                    System.out.println("enter amount to withdraw:");
                    double value = sc.nextDouble();
                    withdraw(value);
                    break;

                case 4:
                    Checking();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void createaccount(String name, String accnumber, double balance) {
        System.out.println("name of account holder:" + name);
        System.out.println("account number of holder:" + accnumber);
        System.out.println("account balance of holder:" + balance);
    }

    static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("invalid deposit amount");
        } else {
            balance = balance + amount;
            System.out.println("amount deposited successfully");
        }
    }

    static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("invalid balance amount");
        } else {
            balance = balance - amount;
            System.out.println("amount withdrawn successfully");
        }
    }

    static void Checking() {
        System.out.println("your current balance :" + balance);
    }
}