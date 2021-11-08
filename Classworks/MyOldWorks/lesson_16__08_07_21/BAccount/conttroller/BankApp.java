package lesson_16__08_07_21.BAccount.conttroller;
import lesson_16__08_07_21.BAccount.BankAccount;

public class BankApp {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[4];

        accounts[0] = new BankAccount(123456789, "Leumi", 123, "John Smith", 1000);
        accounts[0].deposit(500);
        boolean check = accounts[0].withdraw(2000);

        accounts[1] = new BankAccount(987654321, "Leumi", 321, "Mary Jakson");
        accounts[2] = new BankAccount(834927340, "Leumi", 222, 1_000_000);
        accounts[3] = new BankAccount(000001101, "X-X", 555);

        accounts[0].display();
        accounts[1].display(true);
        accounts[2].display();
        accounts[3].display();

        double total = 0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        System.out.println("Total: " + total + "");

    }
}
