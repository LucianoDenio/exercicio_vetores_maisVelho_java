package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Old;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Old[] person = new Old[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Dados da " + i++ + "a pessoa:");
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			
			person[i] = new Old(name,age);
	
		}
		
		int ageOld = 0;
		String veryOld = "";
		
		for(int i=0;i<person.length;i++) {
			if(person[i].getAge()>ageOld) {
				ageOld = person[i].getAge();
				veryOld = person[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA : " + veryOld);
		
		
		sc.close();

	}

}
