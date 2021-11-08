package telran.bank.controller;

import telran.bank.model.BankAccount;

public class BankAppl {

	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[4];
		accounts[0] = new BankAccount(1234567890, "Leumi", 123, "John Smith", 1000);
		System.out.println(accounts[0].getOwner());
		System.out.println(accounts[0].getBalance());
		accounts[0].deposit(500);
		System.out.println(accounts[0].getBalance());
		boolean check = accounts[0].withdraw(2000);
		System.out.println(check);
		System.out.println(accounts[0].getBalance());
		accounts[1] = new BankAccount(9876543210l, "Leumi", 123, "Mary Jackson");
		accounts[2] = new BankAccount(111111111, "Pupkin and Sons", 666, 1_000_000);
		accounts[3] = new BankAccount(99999999l, "Pupkin and Sons", 666);
		System.out.println("=========================");
		accounts[0].display(true);
		accounts[1].display(false);
		accounts[2].display();
		accounts[3].display();
		System.out.println("=========================");
		double total = 0;
		for (int i = 0; i < accounts.length; i++) {
			total += accounts[i].getBalance();
		}
		System.out.println("Total: " + total);
	}

}
