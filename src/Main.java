import account.Account;
import account.CurrentAccount;
import account.SavingAccount;
import java.util.Scanner;
import service.AccountService;
import service.AccountServiceImpl;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.print("Enter your name: ");
            name = sc.nextLine().trim();
        } while (name.isEmpty());

        Account account = null;
        AccountService accountService = new AccountServiceImpl();

        System.out.println("\nWelcome " + name + "!");
        System.out.println("Please choose your account type by entering the number:");
        System.out.println("1. Saving Account\n2. Current Account");
        System.out.print("Enter your choice (1 or 2): ");
        int accType = sc.nextInt();

        switch (accType) {
            case 1 ->
                account = new SavingAccount(name, 1000.0);
            case 2 ->
                account = new CurrentAccount(name, 5000.0);
            default -> {
                System.out.println("Invalid account type selected.");
                System.exit(0);
            }
        }
        System.out.print("Account created successfully for " + name + "!\n");

        while (true) {
            System.out.println("\n--- Banking System ---\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    accountService.checkBalance(account);
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositeAmount = sc.nextDouble();
                    accountService.deposit(account, depositeAmount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    accountService.withdraw(account, withdrawAmount);
                }
                case 4 -> {
                    System.out.println("\n---Exiting---");
                    System.out.println("Thankyou for using our banking system " + account.getAccountHolderName() + "!");
                    System.exit(0);
                }
                default ->
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println("\nPress Enter to continue...");
            sc.nextLine(); // Consume the newline character
            sc.nextLine(); // Wait for user to press Enter
        }
    }
}