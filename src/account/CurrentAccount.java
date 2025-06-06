package account;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("$" + amount + " deposited.");
        System.out.println("Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("$" + amount + " withdrawn.");
            System.out.println("Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance in current amount or invalid amount.");
        }
    }
}