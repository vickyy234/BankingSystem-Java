package account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private final String transactionType;
    private final double amount;
    private final LocalDateTime dateTime;

    public Transaction(String type, double amount) {
        this.transactionType = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "[" + dateTime.format(formatter) + "] " + transactionType + ": $" + amount;
    }
}
