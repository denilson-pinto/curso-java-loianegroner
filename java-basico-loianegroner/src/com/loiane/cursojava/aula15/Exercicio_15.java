package com.loiane.cursojava.aula15;

/*
	Faça um Programa que peça os 3 lados de um triângulo. O programa
	deverá informar se os valores podem ser um triângulo. Indique, caso
	os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
	escaleno.

	- Dicas:
	- Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
	- Triângulo Equilátero: três lados iguais;
	- Triângulo Isósceles: quaisquer dois lados iguais;
	- Triângulo Escaleno: três lados diferentes;
*/

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado 1:");
		double lado1 = scan.nextDouble();
		
		System.out.println("Informe o lado 2:");
		double lado2 = scan.nextDouble();
		
		System.out.println("Informe o lado 3:");
		double lado3 = scan.nextDouble();
		
		if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) System.out.println("Triângulo Equilátero.");
			else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) System.out.println("Triângulo Isósceles.");
			else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) System.out.println("Triângulo Escaleno.");
			
		} else System.out.println("Não é um triângulo");
	}

}
