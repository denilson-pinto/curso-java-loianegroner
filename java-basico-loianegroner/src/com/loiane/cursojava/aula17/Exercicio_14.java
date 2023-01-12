package com.loiane.cursojava.aula17;

/*
  Faça um programa que peça 10 números inteiros, calcule e mostre a
  quantidade de números pares e a quantidade de números ímpares.
*/

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int totalPares = 0;
		int totalImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um número:");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) totalPares++;
			else totalImpares++;
		}
		
		System.out.println("Quantidade de números pares: " + totalPares);
		System.out.println("Quantidade de números ímpares: " + totalImpares);
		
	}

}
