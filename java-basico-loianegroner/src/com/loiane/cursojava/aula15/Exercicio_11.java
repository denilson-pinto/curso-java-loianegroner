package com.loiane.cursojava.aula15;

/*
	As Organizações Tabajara resolveram dar um aumento de salário aos
	seus colaboradores e lhe contrataram para desenvolver o programa que
	calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o
	reajuste segundo o seguinte critério, baseado no salário atual:
	
	- salários até R$ 280,00 (incluindo) : aumento de 20%;
	- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%;
	- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%;
	- salários de R$ 1500,00 em diante : aumento de 5%.
	
	Após o aumento ser realizado, informe na tela:

	- o salário antes do reajuste;
	- o percentual de aumento aplicado;
	- o valor do aumento;
	- o novo salário, após o aumento.
*/

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário:");
		double salario = scan.nextDouble();
		 
		int percentual = 0; 
		if(salario <= 280) {
			percentual = 20;
		} else if(salario > 280 && salario <= 700) {
			percentual = 15;
		} else if(salario > 700 && salario <= 1500) {
			percentual = 10;
		} else if(salario > 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double novoSalario = salario + aumento;
		
		System.out.printf("\nSALÁRIO:\t\tR$ %.2f", salario);
		System.out.println("\nPERCENTUAL:\t\t" + percentual + "%");
		System.out.printf("VALOR DO AUMENTO:\tR$ %.2f", aumento);
		System.out.printf("\nNOVO SALÁRIO:\t\tR$ %.2f", novoSalario);
	}

}
