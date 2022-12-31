package com.loiane.cursojava.aula15;

/*
	Faça um Programa que verifique se uma letra digitada é "F" ou "M".
	Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M:");
		String letra = scan.next();
		
		/*if (letra.equalsIgnoreCase("F")) System.out.println("F - Feminino");
		else if (letra.equalsIgnoreCase("M")) System.out.println("M - Masculino");
		else System.out.println("Sexo Inválido");*/
		
		
		switch(letra.toUpperCase()) {
		case "F": System.out.println("F - Feminino"); break;
		case "M": System.out.println("M - Masculino"); break;
		default: System.out.println("Sexo Inválido");
		}
		
	}

}
