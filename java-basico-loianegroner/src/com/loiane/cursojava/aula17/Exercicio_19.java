package com.loiane.cursojava.aula17;

// Faça um programa que calcule o mostre a média aritmética de N notas.

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de notas:");
		int notas = scan.nextInt();
		
		/*
		Solução da Loiane
		
		double soma = 0;
		double media = 0;
		double nota;
		
		for(int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota: " + (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		*/
		
		
		//Minha solução
		String resposta;
		double nota, media;
		double soma = 0;
		int totalNotas = 0;
		boolean continuar = true;
		
		do {
			
			System.out.println("Informe a nota:");
			nota = scan.nextDouble();
			
			totalNotas++;
			soma += nota;
			
			System.out.println("Deseja informar outra nota (S/N) ?");
			resposta = scan.next();
			
			if(resposta.length() > 1) {
				System.out.println("Valor inválido!");
			} else if(resposta.equalsIgnoreCase("N")) {
				continuar = false;
			}
		
			
		} while(continuar);
		
		media = soma / totalNotas;
		System.out.println("-----------------------------------");
		System.out.println("Média: " + media);
		
	}

}
