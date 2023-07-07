package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:  ");
		double withdraw = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdraw);
		
		try {
			System.out.println();
			System.out.println("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
