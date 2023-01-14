package com.loiane.cursojava.aula17;

/*
  Faça um programa que calcule o fatorial de um número inteiro
  fornecido pelo usuário. Ex.: 5!= 5.4.3.2.1 = 120.
*/

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para o cálculo do fatorial:");
		int numero = scan.nextInt();
		
		System.out.println("\nFatorial de " + numero + " (" + numero + "!):");
		
		int fatorial = 1;
		
		for(int i = numero; i > 0; i--) {
			fatorial *= i;
			System.out.print(i + " ");
		}
		
		System.out.println("\nResultado: " + fatorial);
		
	}

}
