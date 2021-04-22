package zad2;

public class Account {
    private static double interestRate = 0.0;
    private double balance = 0.0;

    public Account() {
    }

    public static void setInterestRate(double v) {
        interestRate = v;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double cash) {
        if (cash <= 0.0) {
            return;
        }

        balance += cash;
    }

    public double withdraw(double cash) {
        if (cash <= 0.0) {
            return 0.0;
        }

        if (cash > balance) {
            cash = balance;
        }

        balance -= cash;
        return cash;
    }

    public void transfer(Account p, double cash) {
        p.deposit(this.withdraw(cash));
    }

    public void addInterest() {
        balance = Math.max(0.0, balance * (100 + interestRate) / 100.0);
    }
}
