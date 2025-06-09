package service;

import account.Account;

public interface AccountService {

    void checkBalance(Account account);

    void deposit(Account account, double amount);

    void withdraw(Account account, double amount);
}
