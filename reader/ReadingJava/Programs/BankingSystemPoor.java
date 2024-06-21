import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance) {
        Account account = new Account(accountNumber, customerName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void performTransaction(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
            System.out.println("Transaction successful. Updated balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

// make main an interactive program. 
// The user should be able to add accounts, perform transactions, and display account information.
// The user should be able to continue interacting with the program until they choose to exit.

// Each of these should be a different COMMIT
// Adda way for the program to be compiled with _different backends chosen_. (as in, build it with a file backend, and then build it with a db backend)
// change it to save all therse transactions into a local database.
// use a hashmap to store the transactions.
// use a file to store the transactions.
// use a database to store the transactions.
// use a cloud database to store the transactions. (Use Bigtable https://cloud.google.com/bigtable)

public class BankingSystemPoor {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding a few accounts
        bank.addAccount("101", "John Doe", 1000.0);
        bank.addAccount("102", "Jane Smith", 1500.0);

        // Performing transactions
        bank.performTransaction("101", 500.0);
        bank.performTransaction("103", 200.0); // This account doesn't exist

        // Displaying account information
        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}
