package com.loiane.cursojava.aula15;

/*
	Faça um Programa que peça um número correspondente a um
	determinado ano e em seguida informe se este ano é ou não bissexto.
*/

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano:");
		int ano = scan.nextInt();
		
		if(ano < 0) System.out.println("Não é um ano válido!");
		else if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) System.out.println("É Bissexto.");
		else System.out.println("Não é Bissexto.");
	}

}
