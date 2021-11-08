package telran.TransferMoneyDeadLock.service;

import telran.TransferMoneyDeadLock.model.Account;

import java.util.Random;

public class Transfer implements Runnable {
    private static final int N_TRANSACTION =10_000;
    Account assDonor;
    Account accRecipient;
    int sum;
    Thread thread;

    public Transfer(Account assDonor, Account accRecipient, int sum) {
        this.assDonor = assDonor;
        this.accRecipient = accRecipient;
        this.sum = sum;
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < N_TRANSACTION; i++){
            int sum = random.nextInt(this.sum);
            transferMoney(assDonor, accRecipient, sum);
        }
    }

    private void transferMoney(Account accFrom, Account accTo, int sum) {
        synchronized (accFrom) {
            synchronized (accTo) {
                if (accFrom.getBalance() >= sum) {
                    accFrom.debit(sum);
                    accTo.credit(sum);
                }
            }
        }
    }
}
