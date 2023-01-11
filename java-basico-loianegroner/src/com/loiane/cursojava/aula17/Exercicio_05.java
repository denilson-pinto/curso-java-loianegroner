package com.loiane.cursojava.aula17;

/*
  Altere o programa anterior permitindo ao usuário informar as
  populações e as taxas de crescimento iniciais. Valide a entrada e
  permita repetir a operação. 
*/

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double populacaoA, populacaoB, taxaA, taxaB;
		int cont = 0;
		boolean valido = false;
		
		do {
			System.out.println("Informe a população de A:");
			populacaoA = scan.nextDouble();
			
			if(populacaoA > 0) valido = true;
			else System.out.println("Valor inválido! População precisa ser maior que zero.");
			
		} while(!valido);
			
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da população de A:");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0 ) valido = true;
			else System.out.println("Valor inválido! Taxa precisa ser maior que zero.");
		
		} while(!valido);
			
		valido = false;
		
		do {
			System.out.println("Informe a população de B:");
			populacaoB = scan.nextDouble();
			
			if(populacaoB > 0) valido = true;
			else System.out.println("Valor inválido! População precisa ser maior que zero.");
			
		} while(!valido);
			
		valido = false;	
		
		do {
			System.out.println("Informe a taxa de crescimento da população de B:");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0 ) valido = true;
			else System.out.println("Valor inválido! Taxa precisa ser maior que zero.");
			
		} while(!valido);
				
		while (populacaoA < populacaoB) {
			populacaoA += (populacaoA / 100) * taxaA;
			populacaoB += (populacaoB / 100) * taxaB;
			cont++;
		}
			
		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("A ultrapassa B em " + cont + " anos.");
		
	}

}
