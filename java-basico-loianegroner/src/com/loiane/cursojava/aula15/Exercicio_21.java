package com.loiane.cursojava.aula15;

/*
	Um posto está vendendo combustíveis com a seguinte tabela dedescontos:

	- Álcool:
	  a. até 20 litros, desconto de 3% por litro
	  b. acima de 20 litros, desconto de 5% por litro

	- Gasolina:
	  c. até 20 litros, desconto de 4% por litro
	  d. acima de 20 litros, desconto de 6% por litro 
	  
	Escreva um algoritmo que leia o número de litros vendidos, o tipo de
	combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e 
	imprima o valor a ser pago pelo cliente	sabendo-se que o preço do litro 
	da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
*/

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Total de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Tipo de combustível (A-Álcool, G-Gasolina):");
		String combustivel = scan.next();
		
		double precoAlcool = 1.9;
		double precoGasolina = 2.5;
		double totalCombustivel = 0;
		double desconto = 0;
		int percentual = 0;
		
		if (combustivel.length() > 1) {
			System.out.println("Tipo inválido!");
		} else if (combustivel.equalsIgnoreCase("A")) {

			if (litros <= 20) {
				percentual = 3;
			} else if (litros > 20) {
				percentual = 5;
			}
			
			totalCombustivel = litros * precoAlcool;

		} else if (combustivel.equalsIgnoreCase("G")) {

			if (litros <= 20) {
				percentual = 4;
			} else if (litros > 20) {
				percentual = 6;
			}
			
			totalCombustivel = litros * precoGasolina;
		}
		
		desconto = (totalCombustivel / 100) * percentual;
		
		double precoFinal = totalCombustivel - desconto;
		
		System.out.printf("Valor a ser pago: R$ %.2f", precoFinal);
		
	}

}
