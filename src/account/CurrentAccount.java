package account;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
        System.out.println("Current Account created successfully for " + name + "!");
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction("Deposit", amount);
        System.out.println("$" + amount + " deposited.");
        System.out.println("Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount && amount > 0) {
            setBalance(getBalance() - amount);
            addTransaction("Withdrawal", amount);
            System.out.println("$" + amount + " withdrawn.");
            System.out.println("Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance in current account or invalid amount.");
        }
    }
}
