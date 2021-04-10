package zad2;

public class BankCustomer {

    private Account account = new Account();
    private Person person;

    public BankCustomer(Person p) {
        person = p;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString()
    {
        return String.format("Klient: %s stan konta %1.2f", person.getName(), account.getBalance());
    }

}
