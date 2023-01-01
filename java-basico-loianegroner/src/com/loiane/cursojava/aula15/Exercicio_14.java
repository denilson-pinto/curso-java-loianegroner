package com.loiane.cursojava.aula15;

/*
	Faça um programa que lê as duas notas parciais obtidas por um aluno
	numa disciplina ao longo de um semestre, e calcule a sua média. A
	atribuição de conceitos obedece à tabela abaixo:
	
	Média de Aproveitamento		Conceito
	Entre 	9.0 e 10.0				A
	Entre 	7.5 e 9.0				B
	Entre 	6.0 e 7.5				C
	Entre 	4.0 e 6.0				D
	Entre 	4.0 e zero				E
	
	O algoritmo deve mostrar na tela as notas, a média, o conceito
	correspondente e a mensagem “APROVADO” se o conceito for
	A, B ou C ou “REPROVADO” se o conceito for D ou E.
*/

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira Nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Segunda Nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = " ";
		if(media >= 9 && media <= 10) conceito = "A";
		else if( media >= 7.5 && media < 9) conceito = "B";
		else if (media >= 6 && media < 7.5) conceito = "C";
		else if (media >= 4 && media < 6) conceito = "D";
		else if(media >= 0 && media < 4) conceito = "E";
		
		System.out.print("\nNOTA 1: " + nota1 + " --- " + "NOTA 2: " + nota2 + " --- MÉDIA: " + media + " --- CONCEITO: " + conceito + " --- ");
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO"); break;
		case "D":
		case "E": System.out.println("REPROVADO");
		}
	}

}
