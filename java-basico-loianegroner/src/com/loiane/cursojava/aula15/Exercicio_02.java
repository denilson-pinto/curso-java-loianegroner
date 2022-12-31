package com.loiane.cursojava.aula15;

/*
	Faça um Programa que peça um valor e mostre na tela se o valor é
	positivo ou negativo.
*/

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número diferente de zero:");
		int numero = scan.nextInt();
		
		if (numero > 0) {
			System.out.println("O número " + numero + " é positivo.");
		} else if (numero < 0) {
			System.out.println("O número " + numero + " é negativo.");
		} else if (numero == 0) {
			System.out.println("Você digitou zero.");
		}
	}

}
