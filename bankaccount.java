import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount) throws Exception;

    void checkBalance();
}

class Account implements BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Amount Withdrawn Successfully");
    }

    @Override
    public void checkBalance() {
        System.out.println("Available Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        Account account = new Account(name, accNo, balance);

        System.out.print("Operation (Deposit/Withdraw): ");
        String operation = sc.nextLine();

        try {
            if (operation.equalsIgnoreCase("Deposit")) {
                System.out.print("Deposit Amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                System.out.print("Withdraw Amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            } else {
                System.out.println("Invalid Operation");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Transaction Failed");
        }

        account.checkBalance();
        sc.close();
    }
}
