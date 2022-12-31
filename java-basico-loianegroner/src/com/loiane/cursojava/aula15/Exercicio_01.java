package com.loiane.cursojava.aula15;

//	Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O número " + numero1 + " é maior");
		} else if (numero1 < numero2) {
			System.out.println("O número " + numero2 + " é maior");
		} else if (numero1 == numero2) {
			System.out.println("Os números são iguais");
		}
	}

}
