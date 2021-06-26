package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		System.out.print("Entre como o nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Entre com as notas dos trimestres: ");
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
		
		String s = "PASS";
		
		if (aluno.finalGrade()<60) {
			s = "FAILED";
			System.out.println(s);
			System.out.printf("MISSING %.2f POINTS", aluno.missingPoints());
			}
			else {
				System.out.println(s);
			
				}
		sc.close();
	}

}
