package account;

public abstract class Account {

    private final String accountHolderName;
    private double balance;

    public Account(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
        System.out.println("Initial balance is " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}