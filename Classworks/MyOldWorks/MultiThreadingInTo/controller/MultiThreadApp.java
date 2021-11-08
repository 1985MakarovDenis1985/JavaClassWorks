package telran.MultiThreadingInTo.controller;

import telran.MultiThreadingInTo.tasks.MyTaskExtendsThread;
import telran.MultiThreadingInTo.tasks.MyTaskImplements;

public class MultiThreadApp {
    private static final int MAX = 10;
    private static final int SIZE = 3;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starting... ");
//        MyTaskImplements task1 = new MyTaskImplements("TaskImplements#1", MAX);
//        Thread thread1 = new Thread(task1);
//        Thread thread2 = new MyTaskExtendsThread("TaskExtends", MAX);

        MyTaskImplements[] tasks = new MyTaskImplements[SIZE];
        for (int i=0; i<tasks.length; i++){
            tasks[i] = new MyTaskImplements("Task # " + i, MAX);
//            new Thread(tasks[i]).start(); // не подходит
        }

        Thread[] threads = new Thread[SIZE];
        for (int i=0; i < threads.length; i++){
            threads[i] = new Thread(tasks[i]);
        }

        for (int i=0; i < threads.length; i++){
            threads[i].start();
        }

//        thread1.start();
//        thread2.start();

//        for (int i=0; i < MAX; i++){
//            System.out.println("In thread Main, count = " + i);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        thread1.join();
//        thread2.join();

        for (int i=0; i<threads.length; i++){
            threads[i].join();
        }
        System.out.println("----- Main end");
    }
}
