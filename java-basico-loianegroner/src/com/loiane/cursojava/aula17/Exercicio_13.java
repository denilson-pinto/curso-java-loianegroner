package com.loiane.cursojava.aula17;

/*
  Faça um programa que peça dois números, base e expoente, calcule e
  mostre o primeiro número elevado ao segundo número. Não utilize a
  função de potência da linguagem.
*/

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int base = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int exp = scan.nextInt();
		
		int resultado = base;
		
		for(int i = 1; i < exp; i++) {
			resultado *= base;	
		}
		
		System.out.println(base + " elevado a " + exp + " = " + resultado);
	}

}
