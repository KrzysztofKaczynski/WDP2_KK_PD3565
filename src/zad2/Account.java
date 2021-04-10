package zad2;

public class Account {
    private static double interestRate = 0.0;
    private double balance = 0.0;

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double cash) {
        balance += cash;
    }

    public double withdraw (double cash) {
        if (cash > balance) {
            cash = balance;
        }
        balance -= cash;
        return cash;
    }

    public static void setInterestRate (double v) {
        interestRate = v;
    }

    public void transfer(Account p, double cash) {
        p.deposit(this.withdraw(cash));
    }

    public void addInterest() {
        balance = balance * (100 + interestRate) / 100;
    }



}
