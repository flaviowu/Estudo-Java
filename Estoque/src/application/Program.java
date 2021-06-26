package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do Produto:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem adicionados ao estoque: ");
		
		quantity = sc.nextInt();
		
		product.addprod(quantity);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.remprod(quantity);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + product);
		
		sc.close();
	}

}
