package applcation;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 9;
		Room[] rent = new Room[n];
		
		System.out.print("Quantos quartos serão alugados? ");
		int nquartos = sc.nextInt();
		
		for(int i=1; i<=nquartos; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room number: ");
			int nquarto = sc.nextInt();
			System.out.println();
			rent[nquarto] = new Room(name, email);
		}
		
		for(int i=0; i<n; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
			
		}
	
		
		sc.close();

	}

}
