package ch06.exercise.p19;

public class App {
    public static void main(String[] args) {

        Account account = new Account();

        account.setBalance(10000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(-100);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.setBalance(300000);
        System.out.println("account.getBalance() = " + account.getBalance());

    }
}
