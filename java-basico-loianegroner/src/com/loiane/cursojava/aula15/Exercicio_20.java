package com.loiane.cursojava.aula15;

/*
	Faça um programa que faça 5 perguntas para uma pessoa sobre um
	crime. As perguntas são:

	a. "Telefonou para a vítima?"
	b. "Esteve no local do crime?"
	c. "Mora perto da vítima?"
	d. "Devia para a vítima?"
	e. "Já trabalhou com a vítima?"
	
	O programa deve no final emitir uma classificação sobre a 
	participação da pessoa no crime. Se a pessoa responder
	positivamente a 2 questões ela deve ser classificada como "Suspeita", 
	entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, 
	ele será classificado como "Inocente".
*/

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda as seguintes perguntas com S(Sim) ou N(Não):");
		
		System.out.println("Telefonou para a vítima?");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vítima?");
		String resposta4 = scan.next();
		
		System.out.println("Já trabalhou com a vítima?");
		String resposta5 = scan.next();
		
		int totalSim = 0;
		
		if(resposta1.length() > 1) System.out.println("Valor inválido!");
		else if(resposta1.equalsIgnoreCase("S")) {
			totalSim++;
		}
		
		if(resposta2.length() > 1) System.out.println("Valor inválido!"); 
		else if(resposta2.equalsIgnoreCase("S")) {
			totalSim++;
		}
		
		if(resposta3.length() > 1) System.out.println("Valor inválido!");
		else if(resposta3.equalsIgnoreCase("S")) {
			totalSim++;
		}
		
		if(resposta4.length() > 1) System.out.println("Valor inválido!");
		else if(resposta4.equalsIgnoreCase("S")) {
			totalSim++;
		}
		
		if(resposta5.length() > 1) System.out.println("Valor inválido!");
		else if(resposta5.equalsIgnoreCase("S")) {
			totalSim++;
		}
		
		switch(totalSim) {
		case 2: System.out.println("Suspeita"); break;
		case 3:
		case 4: System.out.println("Cúmplice"); break;
		case 5: System.out.println("Assassino"); break;
		default: System.out.println("Inocente");
		}
	}

}
