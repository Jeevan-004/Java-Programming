import java.util.Scanner;

class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, long accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void acceptDeposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String customerName, long accountNumber) {
        super(customerName, accountNumber, "Savings");
        this.interestRate = 0.05; 
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        acceptDeposit(interest);
        System.out.println("Interest deposited. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    double minimumBalance;
    double serviceCharge;

    public CurrentAccount(String customerName, long accountNumber) {
        super(customerName, accountNumber, "Current");
        this.minimumBalance = 1000.0; 
        this.serviceCharge = 10.0; 
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge imposed. Updated balance: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();

        SavingsAccount savingsAccount = new SavingsAccount(customerName, accountNumber);
        CurrentAccount currentAccount = new CurrentAccount(customerName, accountNumber);

        // Test the methods
        savingsAccount.acceptDeposit(1000);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.displayBalance();

        currentAccount.acceptDeposit(1500);
        currentAccount.withdraw(200);
        currentAccount.displayBalance();

        scanner.close();
    }
}
