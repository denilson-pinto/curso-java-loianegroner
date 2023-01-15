package com.loiane.cursojava.aula17;

/*
  Faça um programa que calcule o número médio de alunos por turma.
  Para isto, peça a quantidade de turmas e a quantidade de alunos para
  cada turma. As turmas não podem ter mais de 40 alunos.
*/

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de turmas:");
		int totalTurmas = scan.nextInt();
		
		System.out.println("--------------------------------------------");
		
		int qtdAlunosTurma = 0;
		int qtdTotalAlunos = 0;
		double media;
		boolean turmaInvalida = true;
		
		for (int i = 1; i <= totalTurmas; i++) {

			turmaInvalida = true;

			do {
				
				System.out.println("Informe a quantidade de alunos da " + i + "º turma:");
				qtdAlunosTurma = scan.nextInt();
				
				if (qtdAlunosTurma <= 40) {
					turmaInvalida = false;			
				} else {
					
					System.out.println("Valor inválido! As turmas não podem ter mais de 40 alunos.");
					System.out.println("-----------------------------------------------------------");
					
				}
				
			} while (turmaInvalida);

			qtdTotalAlunos += qtdAlunosTurma;

		}
		
		media = qtdTotalAlunos / totalTurmas;
		
		if(!turmaInvalida) {
			System.out.println("--------------------------------");
			System.out.println("Média de alunos por turma: " + media);
		}
		
	}
	
}
