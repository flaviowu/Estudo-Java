package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco"); // adiciona Marco na posição 2
		
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("_____________________________");
		
		list.remove(1); //remove Alex. També pode remover por comparação, por ex. "Anna"
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("_____________________________");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //dá a posição de "Bob na lista"
		System.out.println("_____________________________");
		list.add("Alex");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("_____________________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}

}
