package com.loiane.cursojava.aula13;

/*
	Tendo como dados de entrada a altura de uma pessoa, construa um
	algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
	(72.7*altura) - 58
*/

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.printf("Peso ideal: %.2f", ((72.7 * altura) - 58));
	}

}
