package com.loiane.cursojava.aula17;

/*
  Faça um programa que receba dois números inteiros e gere os
  números inteiros que estão no intervalo compreendido por eles. 
*/

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Os números precisam ser diferentes!");
		} else if (num1 > num2) {
			num1 += num2;
			num2 = num1 - num2;
			num1 -= num2;
		}

		for (int i = num1; i <= num2; i++) {
			if (num1 != num2) System.out.println(i);
		}

	}

}
