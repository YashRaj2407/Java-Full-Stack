// Base class
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}


class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

  
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Overdraft Limit Exceeded!");
        }
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Alice", 1000, 5);
        sa.displayInfo();
        sa.deposit(500);
        sa.addInterest();
        sa.withdraw(700);

        System.out.println();

        CurrentAccount ca = new CurrentAccount("Bob", 2000, 1000);
        ca.displayInfo();
        ca.withdraw(2500);
        ca.withdraw(600);
    }
}
