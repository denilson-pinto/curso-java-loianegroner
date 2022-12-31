package com.loiane.cursojava.aula13;

/*
	Faça um programa que peça o tamanho de um arquivo para download (em MB) 
	e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo 
	aproximado de download do arquivo usando este link (em minutos).
*/

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo:");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet:");
		double velocidade = scan.nextDouble();
		
		double tempo =  tamanhoArquivo / velocidade;
		
		System.out.printf("Tempo de download: %.2f minutos", tempo); 
	}

}
