package com.loiane.cursojava.aula15;

//	Faça um Programa que leia três números e mostre o maior deles.

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número:");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) System.out.println("Número " + numero1 + " é o maior.");
		else if (numero2 > numero1 && numero2 > numero3) System.out.println("Número " + numero2 + " é o maior.");
		else if (numero3 > numero1 && numero3 > numero2) System.out.println("Número " + numero3 + " é o maior.");
		
	}

}
