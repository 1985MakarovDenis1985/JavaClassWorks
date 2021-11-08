package telran.ReentLock.Elevators.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Truck implements Runnable {
    private static Lock lock = new ReentrantLock(true); // справедливая блокировка -> все кто в ожидании открытия замка идут по порядку а не кто первый захватит монитор
    int nRaces;
    int capacity;
    Elevator elevator;

    public Truck(int nRaces, int capacity, Elevator elevator) {
        this.nRaces = nRaces;
        this.capacity = capacity;
        this.elevator = elevator;
    }

    @Override
    public void run() {
        for (int i = 0; i < nRaces; i++) {
            try{
//                lock.lock();
                elevator.add(capacity);
            }
            finally {
//                lock.unlock();
            }
        }
    }
}
