package account;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private final long accountNumber;
    private final String accountHolderName;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        System.out.println("\nAccount Number is " + accountNumber);
        System.out.println("Initial balance is " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    private long generateAccountNumber() {
        return (long) (Math.random() * 1_000_000_000_000_000L);
    }

    protected void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public void displayTransaction() {
        System.out.println("Transaction History for Account Number: " + getAccountNumber());
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
        System.out.println("Final Balance: " + getBalance());
        System.out.println("End of Transaction History.");
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
