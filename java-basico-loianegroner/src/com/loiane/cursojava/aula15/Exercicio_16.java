package com.loiane.cursojava.aula15;

/*
	Faça um programa que calcule as raízes de uma equação do segundo
	grau, na forma ax² + bx + c. O programa deverá pedir os valores de A,
	B e C e fazer as consistências, informando ao usuário nas seguintes situações:

	a. Se o usuário informar o valor de A igual a zero, a equação não é
	   do segundo grau e o programa não deve pedir os demais
	   valores, sendo encerrado;

	b. Se o delta calculado for negativo, a equação não possui raizes
	   reais. Informe ao usuário e encerre o programa;

	c. Se o delta calculado for igual a zero a equação possui apenas
	   uma raiz real; informe-a ao usuário;

	d. Se o delta for positivo, a equação possui duas raiz reais;
	   informe-as ao usuário;
*/

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de a:");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau.");
		} else {
			System.out.println("Informe o valor de b:");
			int b = scan.nextInt();

			System.out.println("Informe o valor de c:");
			int c = scan.nextInt();

			double delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				System.out.println("Delta é negativo");
			} else {
				System.out.println("Delta: " + delta);

				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("X1: " + x1);
				System.out.println("X2: " + x2);

			}
		}

	}
}
