package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcdata;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcdata funcionario = new Funcdata();
		System.out.println("Entre como o nome do funcionário: ");
		funcionario.fn = sc.nextLine();
		System.out.println("Entre como o salário do funcionário: ");
		funcionario.sb = sc.nextDouble();
		System.out.println("Entre como a alíquota do imposto: ");
		funcionario.i = sc.nextDouble();
		
		System.out.println("Funcionário:" + funcionario.fn);
		System.out.printf("Salário líquido: $%.2f%n", funcionario.sl());
		System.out.println();
		System.out.println("Em quantos porcentos deseja aumentar o Salário de " + funcionario.fn + "?");
		funcionario.p = sc.nextDouble();
		System.out.println();
		System.out.printf("Salário ajustado: $%.2f%n", funcionario.sa());
		
		sc.close();
		
		
	}

}
