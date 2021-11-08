package telran.TransferMoneyDeadLock.controller;

import telran.TransferMoneyDeadLock.model.Account;
import telran.TransferMoneyDeadLock.service.Transfer;

public class TransferDeadLockApp {
    public static void main(String[] args) throws InterruptedException {
        Account father = new Account(1);
        Account son = new Account(2);

        father.credit(1000);
        son.credit(1000);

        Transfer transfer1 = new Transfer(father, son, 500);
        Transfer transfer2 = new Transfer(son, father, 400);

        transfer1.getThread().join();
        transfer2.getThread().join();
        System.out.println("Balance : " + father.getAccNumber() + " = " + father.getBalance());
        System.out.println("Balance : " + son.getAccNumber() + " = " + son.getBalance());

    }
}
