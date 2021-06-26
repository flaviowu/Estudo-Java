package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountOP;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccountOP account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?: ");
		char option = sc.next().charAt(0);
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double iniDeposit = sc.nextDouble();
			account = new AccountOP(number, name, iniDeposit);
		}
		else {
			account = new AccountOP(number, name);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.addBalance(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		account.subBalance(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
