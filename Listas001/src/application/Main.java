package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Worker> workerlist = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();

			while (hasId(workerlist, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			Worker worker = new Worker(id, name, salary);
			workerlist.add(worker);
		}

		System.out.print("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();

		Worker workerl = workerlist.stream().filter(x -> x.getIdnumber() == id).findFirst().orElse(null);
		if (workerl == null) {
			System.out.println("This employee does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double raise = sc.nextDouble();
			workerl.raiseSalary(raise);
		}
		System.out.println();
		for (Worker obj : workerlist) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Worker> workerlist, int id) {
		Worker emp = workerlist.stream().filter(x -> x.getIdnumber() == id).findFirst().orElse(null);
		return emp != null;
	}
}