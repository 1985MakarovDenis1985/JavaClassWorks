package telran.TransferMoneyDeadLock.model;

import java.util.Objects;

public class Account {
    int accNumber;
    int balance;

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    public Account(int accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int sum) {
        this.balance -= sum;
    }
    public void credit(int sum) {
        this.balance += sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accNumber == account.accNumber && balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNumber, balance);
    }
}
