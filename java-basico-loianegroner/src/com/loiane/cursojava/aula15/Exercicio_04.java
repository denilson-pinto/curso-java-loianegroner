package com.loiane.cursojava.aula15;

//	Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		/*if (letra.length() > 1) System.out.println("Não é um valor válido");
		  else if (letra.equalsIgnoreCase("a") || 
			       letra.equalsIgnoreCase("e") || 
			       letra.equalsIgnoreCase("i") ||
			       letra.equalsIgnoreCase("o") || 
			       letra.equalsIgnoreCase("u")) System.out.println("Vogal.");
			   else System.out.println("Consoante.");*/
		
		if (letra.length() > 1) System.out.println("Não é um valor válido");
		else {
			switch (letra.toLowerCase()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
			}
		}
		
	}

}
