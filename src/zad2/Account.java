package zad2;

public class Account {


    private static double interestRate = 0.0;
    public double balance = 0.0;

    public Account() {
    }
    public Account(double v) {
        balance = v;
    }
    public void deposit (double cash) {
        balance += cash;
    }
    public void withdraw (double cash) {
        balance -= cash;
        if (balance < 0) {balance = 0;}
    }
    public static void setInterestRate (double v) {
        interestRate = v;
    }
    public void  transfer(Account p, double cash) {
        if (cash > balance) {
            cash = balance;
        }
        this.withdraw(cash);
        p.deposit(cash);
    }
    public void addInterest() {
        balance = balance * (100 + interestRate) / 100;
    }



}
