package com.loiane.cursojava.aula17;

/*
  Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		double media;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			numero = scan.nextInt();

			soma += numero;
		}
		
		media = soma / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
