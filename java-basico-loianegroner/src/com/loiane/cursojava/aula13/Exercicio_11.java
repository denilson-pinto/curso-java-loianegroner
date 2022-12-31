package com.loiane.cursojava.aula13;

/*
	Faça um Programa que peça 2 números inteiros e um número real.
	Calcule e mostre:
	a. o produto do dobro do primeiro com metade do segundo .
	b. a soma do triplo do primeiro com o terceiro.
	c. o terceiro elevado ao cubo.
*/

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe um novo número inteiro: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe um número real: ");
		double numero3 = scan.nextDouble();
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + (numero1 * 2) * (numero2 / 2));
		System.out.println("Soma do triplo do primeiro com o terceiro: " + ((numero1 * 3) + numero3));
		System.out.println("O terceiro elevado ao cubo: " + Math.pow(numero3, 3));
	}

}
