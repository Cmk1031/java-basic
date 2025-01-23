package day11.test.p_20;

public class Account {
    private String accountNumber;
    private String name;
    private int balance;

    public Account(String accountNumber, String name, int deposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = deposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
