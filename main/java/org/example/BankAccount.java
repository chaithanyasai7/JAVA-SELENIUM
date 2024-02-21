//encapsulation

package org.example;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 )
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567890",1234.56);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: $" + bankAccount.getBalance());

        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        System.out.println("Updated Balance: $" + bankAccount.getBalance());
    }
}


