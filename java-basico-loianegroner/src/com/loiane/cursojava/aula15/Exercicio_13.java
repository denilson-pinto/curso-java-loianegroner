package com.loiane.cursojava.aula15;

/*
	Faça um Programa que leia um número e exiba o dia correspondente
	da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
	aparecer valor inválido.
*/

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número entre 1 e 7:");
		int dia = scan.nextInt();
		
		String Str = Integer.toString(dia);
		
		if(Str.length() > 1) System.out.println("Valor Inválido");
		else {
			switch(dia) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Valor Inválido");
			}
		}
	}

}
