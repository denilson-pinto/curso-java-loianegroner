package com.loiane.cursojava.aula13;

/*
	Faça um Programa que peça a temperatura em graus Farenheit,
	transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
*/

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double grausF = scan.nextDouble();
		
		double grausC = (5 * (grausF - 32) / 9);
		
		System.out.printf("Temperatura em graus Celsius: %.2f", grausC);
	}

}
