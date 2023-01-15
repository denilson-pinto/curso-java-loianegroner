package com.loiane.cursojava.aula17;

/*
  Faça um programa que calcule o fatorial de um número inteiro
  fornecido pelo usuário. Ex.: 5! = 5.4.3.2.1 = 120. A saída deve ser
  conforme o exemplo abaixo:
  
  Fatorial de: 5
  5! = 5 . 4 . 3 . 2 . 1 = 120
*/

import java.util.Scanner;

public class Exercicio_26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para o cálculo do fatorial:");
		int numero = scan.nextInt();
		
		int fatorial = 1;

		System.out.println("Fatorial de: " + numero);
		System.out.print(numero + "! = ");
		
		for (int i = numero; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.println("1 = " + fatorial);
	}

}
