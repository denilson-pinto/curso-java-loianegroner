package com.loiane.cursojava.aula15;

/*
	Faça um programa para o cálculo de uma folha de pagamento,
	sabendo que os descontos são do Imposto de Renda, que depende do	
  	salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
	FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
	a empresa que deposita). O Salário Líquido corresponde ao Salário
	Bruto menos os descontos. O programa deverá pedir ao usuário o
	valor da sua hora e a quantidade de horas trabalhadas no mês.

	- Desconto do IR:
	- Salário Bruto até 900 (inclusive) - isento
	- Salário Bruto até 1500 (inclusive) - desconto de 5%
	- Salário Bruto até 2500 (inclusive) - desconto de 10%
	- Salário Bruto acima de 2500 - desconto de 20%
	
	Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
	exemplo o valor da hora é 5 e a quantidade de hora é 220.

	Salário Bruto: (5 * 220) 	: R$ 1100,00
	(-) IR (5%) 				: R$ 55,00
	(-) INSS ( 10%) 			: R$ 110,00
	FGTS (11%) 					: R$ 121,00
	Total de descontos 			: R$ 165,00
	Salário Liquido 			: R$ 935,00
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhas:");
		double totalHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * totalHoras;
		
		int percentualIR = 0;
		if(salarioBruto <= 900) {
			percentualIR = 0;
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if(salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		String formato = "R$ #,##0.00";
		DecimalFormat df = new DecimalFormat(formato);
		
		System.out.println("\nSALÁRIO BRUTO: (" + valorHora + " * " + totalHoras + ")\t: " + df.format(salarioBruto));
		System.out.println("(-) IR (" + percentualIR + "%)\t\t\t: " + df.format(ir));
		System.out.println("(-) INSS (10%)\t\t\t: " + df.format(inss));
		System.out.println("FGTS (11%)\t\t\t: " + df.format(fgts));
		System.out.println("TOTAL DE DESCONTOS\t\t: " + df.format(totalDescontos));
		System.out.println("SALÁRIO LÍQUIDO\t\t\t: " + df.format(salarioLiquido));
	}

}
