package telran.multithreading.controller;

import telran.multithreading.tasks.MyTaskExtends;
import telran.multithreading.tasks.MyTaskImplements;

public class MultiThreadingIntroAppl {

	private static final int MAX = 10;
	private static final int SIZE = 3;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread starting...");
		MyTaskImplements task1 = new MyTaskImplements("TaskImplements", MAX);
		Thread thread1 = new Thread(task1);
		Thread thread2 = new MyTaskExtends("TaskExtends", MAX);
		MyTaskImplements[] tasks = new MyTaskImplements[SIZE];
		for (int i = 0; i < tasks.length; i++) {
			tasks[i] = new MyTaskImplements("Name#"+i, MAX);
			//new Thread(tasks[i]).start();
		}
		Thread[] threads = new Thread[SIZE];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(tasks[i]);
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			//threads[i].join();
		}
		thread1.start();
		thread2.start();
		for(int i = 0; i < MAX; i++) {
			System.out.println("In thread Main, count = " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		thread1.join();
		thread2.join();
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		System.out.println("Main end of thread");
	}

}
