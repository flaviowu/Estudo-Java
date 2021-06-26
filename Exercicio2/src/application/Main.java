package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcdata;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcdata funcionario = new Funcdata();
		System.out.println("Entre como o nome do funcion�rio: ");
		funcionario.fn = sc.nextLine();
		System.out.println("Entre como o sal�rio do funcion�rio: ");
		funcionario.sb = sc.nextDouble();
		System.out.println("Entre como a al�quota do imposto: ");
		funcionario.i = sc.nextDouble();
		
		System.out.println("Funcion�rio:" + funcionario.fn);
		System.out.printf("Sal�rio l�quido: $%.2f%n", funcionario.sl());
		System.out.println();
		System.out.println("Em quantos porcentos deseja aumentar o Sal�rio de " + funcionario.fn + "?");
		funcionario.p = sc.nextDouble();
		System.out.println();
		System.out.printf("Sal�rio ajustado: $%.2f%n", funcionario.sa());
		
		sc.close();
		
		
	}

}
