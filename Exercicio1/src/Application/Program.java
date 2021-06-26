package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle quadrado = new Rectangle();
		
		System.out.print("Entre com a altura do retangulo:");
		quadrado.h = sc.nextDouble();
		System.out.print("Entre com a base do retangulo:");
		quadrado.w = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", quadrado.area());
		System.out.printf("PERIMETRO: %.2f%n", quadrado.perimetro());
		System.out.printf("Diagonal: %.2f%n", quadrado.diagonal());

		sc.close();
	}

}