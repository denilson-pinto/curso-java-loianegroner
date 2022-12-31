package com.loiane.cursojava.aula13;

//	Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor em metros: ");
		double metros = scan.nextDouble();
		
		double cm = metros * 100;
		
		System.out.println(metros + "m é igual a " + cm + "cm");
	}

}
