package com.loiane.cursojava.aula15;

/*
	Faça um Programa que leia 2 números e em seguida pergunte ao
	usuário qual operação ele deseja realizar. O resultado da operação
	deve ser acompanhado de uma frase que diga se o número é:
	
	- par ou ímpar;
	- positivo ou negativo;
*/

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe a operação desejada (Soma + | Subtração - | Multiplicação * | Divisão /):");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = num1 + num2; 
				  System.out.println("Soma: " + resultado); break;
		case "-": resultado = num1 - num2;
				  System.out.println("Subtração: " + resultado); break;
		case "*": resultado = num1 * num2;
				  System.out.println("Multiplicação: " + resultado); break;
		case "/": resultado = num1 / num2;
				  System.out.println("Divisão: " + resultado); break;
		default: System.out.println("Operação inválida!"); 
				 valida = false;
		}
		
		if (valida) {
			if (resultado % 2 == 0) System.out.println("PAR.");
			else System.out.println("ÍMPAR.");

			if (resultado == 0) System.out.println(resultado);
			else if (resultado > 0) System.out.println("POSITIVO");
			else System.out.println("NEGATIVO");
		}
	}

}
