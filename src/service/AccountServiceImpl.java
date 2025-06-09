package service;

import account.Account;

public class AccountServiceImpl implements AccountService {

    @Override
    public void checkBalance(Account account) {
        System.out.println("Checking balance...");
        System.out.println("Your current balance is: " + account.getBalance());
    }

    @Override
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}
