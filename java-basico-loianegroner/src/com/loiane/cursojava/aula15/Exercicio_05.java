package com.loiane.cursojava.aula15;

/*
	Faça um programa para a leitura de duas notas parciais de um aluno.
	O programa deve calcular a média alcançada por aluno e apresentar:
	- A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	- A mensagem "Reprovado", se a média for menor do que sete;
	- A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media < 10) System.out.println("Média: " + media + " - APROVADO");
		else if (media < 7) System.out.println("Média: " + media + " - REPROVADO");
		else if (media == 10) System.out.println("Média: " + media + " - APROVADO COM DISTINÇÃO");
		
	}

}
