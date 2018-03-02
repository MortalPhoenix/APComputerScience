package Chapter_4.Labs.Account;

// *******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************

public class Account {
    private double balance;
    private String name;
    private long acctNum;

    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void chargeFee() {
        balance -= 10;
    }

    public void changeName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", acctNum=" + acctNum +
                '}';
    }
}

