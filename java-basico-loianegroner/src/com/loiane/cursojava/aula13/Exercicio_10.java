package com.loiane.cursojava.aula13;

/*
	Faça um Programa que peça a temperatura em graus Celsius,
	transforme e mostre em graus Farenheit.
*/

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double grausC = scan.nextDouble();
		
		double grausF = (grausC * 1.8) + 32;
		
		System.out.printf("Temperatura em graus Farenheit: %.2f", grausF);
	}

}
