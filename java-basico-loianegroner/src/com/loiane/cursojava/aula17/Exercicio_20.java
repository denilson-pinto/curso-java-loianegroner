package com.loiane.cursojava.aula17;

/*
  Faça um programa que peça para n pessoas a sua idade, ao final o
  programa deverá verificar se a média de idade da turma varia entre 0 e
  25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
  ou idosa, conforme a média calculada.
*/

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quantos alunos tem a turma:");
		int totalAlunos = scan.nextInt();
		
		System.out.println("------------------------------------");
		
		int idade;
		int somaIdade = 0;
		double mediaIdade;
		
		for(int i = 1; i <= totalAlunos; i++) {
			System.out.println("Informe a idade do " + i + "º aluno:");
			idade = scan.nextInt();
			
			somaIdade += idade;
		}
		
		System.out.println("----------------------------------------");
		
		mediaIdade = somaIdade / totalAlunos;
		
		System.out.print("Média de idade: " + mediaIdade);
		
		if(mediaIdade >= 0 && mediaIdade <= 25) {
			System.out.println(" - Turma de Jovens.");
		} else if(mediaIdade >= 26 && mediaIdade <= 60) {
			System.out.println(" - Turma de Adultos.");
		} else if(mediaIdade > 60) {
			System.out.println(" - Turma de Idosos.");
		}
	}

}
