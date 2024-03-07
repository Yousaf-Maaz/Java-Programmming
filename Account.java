// Write a class name Account, having the data members name, date of birth (implement
// through compsition) and balance (declared as private). The class should contains methods
// depositAmount() and withdrawAmount(). They both will take the amount as an argument
// and peforms the transactions by updating the balance. While withdrawing the amount
// check if the amount is less than or equal to balance or not, and do accordingly. The class
// should contain the getter and setter methods for both the data members. In main, create
// the object of account by taking values from the user. Your program should be menu
// driven in a loop. Where the choices must be:
// 1. Display Balance
// 2. Deposit Amount
// 3. Withdraw Amount
// 4. Exit

import java.util.Scanner;

class DateOfBirth {
    private int Day, Month, Year;

    public DateOfBirth(int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public String getFormattedDate() {
        return Day + "/" + Month + "/" + Year;
    }
}

public class Account {
    private String name;
    private DateOfBirth Date_of_birth;
    private double balance;

    // Default constructor
    public Account() {
        this.name = "";
        this.Date_of_birth = null;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(String name, DateOfBirth dob, double balance) {
        this.name = name;
        this.Date_of_birth = dob;
        this.balance = balance;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateOfBirth getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(DateOfBirth dob) {
        this.Date_of_birth = dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount
    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }

    // Method to withdraw amount
    public void withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("------------------------------------------------------");
        System.out.print("Enter your date of birth (DD MM YYYY): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        DateOfBirth dob = new DateOfBirth(day, month, year);

        // Getting formatted date string using getFormattedDate()
        String formattedDate = dob.getFormattedDate();
        System.out.println("Date of Birth: " + formattedDate);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(name, dob, initialBalance);

        int choice;
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.depositAmount(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawAmount(withdrawAmount);
                    break;
                case 4:
                    System.out.println("program Khatam:).");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
