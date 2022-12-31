package com.loiane.cursojava.aula13;

/*
	Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
	Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
	Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
	.  salário bruto.
	a. quanto pagou ao INSS.
	b. quanto pagou ao sindicato.
	c. o salário líquido.
	d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
	
	+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$

	Obs.: Salário Bruto - Descontos = Salário Líquido.
*/

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double INSS = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double IR = (salarioBruto / 100) * 11;
		double descontos = INSS + sindicato + IR;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.printf("SALÁRIO BRUTO: R$ %.2f\n", salarioBruto);
		System.out.printf("INSS: R$ %.2f\n", INSS);
		System.out.printf("SINDICATO: R$ %.2f\n", sindicato);
		System.out.printf("IR: R$ %.2f\n", IR);
		System.out.printf("TOTAL DESCONTOS: R$ %.2f\n", descontos);
		System.out.printf("SALÁRIO LÍQUIDO: R$ %.2f", salarioLiquido);
	}

}
