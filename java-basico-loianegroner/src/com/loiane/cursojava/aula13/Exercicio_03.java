package com.loiane.cursojava.aula13;

//	Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;

		System.out.println("Soma: " + soma);

	}

}
