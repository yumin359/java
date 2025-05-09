package ch06.exercise.p20;

public class Account {
    /*
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
    */

    // 선생님이 하신거

    private String number;
    private String name;
    private int balance;

    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
