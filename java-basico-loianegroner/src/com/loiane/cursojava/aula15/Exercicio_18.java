package com.loiane.cursojava.aula15;

/*
	Faça um Programa que peça um número inteiro e determine se ele é
	par ou impar. Dica: utilize o operador módulo (resto da divisão).
*/

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) System.out.println("É Par.");
		else System.out.println("É Ímpar.");
	}

}
