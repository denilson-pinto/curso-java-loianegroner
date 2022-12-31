package com.loiane.cursojava.aula13;

/*
	Faça um Programa que pergunte quanto você ganha por hora e o
	número de horas trabalhadas no mês. Calcule e mostre o total do seu
	salário no referido mês.
*/

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		double totalHoras = scan.nextDouble();
		
		double salario = valorHora * totalHoras;
		
		System.out.printf("Salário do mês: R$%.2f", salario);
	}

}
