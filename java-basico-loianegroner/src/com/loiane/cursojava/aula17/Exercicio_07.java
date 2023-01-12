package com.loiane.cursojava.aula17;

/*
  Faça um programa que leia 5 números e informe o maior número. 
*/

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = -1;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			
			System.out.println("O maior é: " + maior);
		}
	}

}
