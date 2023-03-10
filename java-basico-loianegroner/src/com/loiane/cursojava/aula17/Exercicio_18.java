package com.loiane.cursojava.aula17;

/*
  Faça um programa que peça um número inteiro e determine se ele é
  ou não um número primo. Um número primo é aquele que é divisível
  somente por ele mesmo e por 1.
*/

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < numero; i++) {
			
			if(numero % i == 0) {
				System.out.println("Não é primo."); 
				primo = false;
				break;
			}
		} 
		
		if(primo) System.out.println("É primo.");

	}

}
