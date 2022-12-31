package com.loiane.cursojava.aula15;

//	Faça um Programa que leia três números e mostre o maior e o menor deles.

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número:");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) System.out.println("Maior: " + numero1 + " - Menor: " + numero3);
		else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) System.out.println("Maior: " + numero2 + " - Menor: " + numero3);
		else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) System.out.println("Maior: " + numero3 + " - Menor: " + numero2);
		else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) System.out.println("Maior: " + numero3 + " - Menor: " + numero1);
		else if (numero1 == numero2 && numero1 == numero3) System.out.println("Números iguais.");
		
	}

}
