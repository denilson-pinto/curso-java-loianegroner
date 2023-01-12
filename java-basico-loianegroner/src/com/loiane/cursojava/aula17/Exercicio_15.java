package com.loiane.cursojava.aula17;

/*
  A série de Fibonacci é formada pela seqüência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... 
  Faça um programa capaz de gerar a série até o n−ésimo termo.
*/

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o n-ésimo termo da série de Fibonacci:");
		int numero = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		if(numero < 2) {
			System.out.println(numero);
		} else {
			
			System.out.print(primeiro + " " + segundo + " ");
			
			for (int i = 3; i <= numero; i++) {

				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;

				System.out.print(proximo + " ");
				
			}
		}
			
		
	}

}
