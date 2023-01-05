package com.loiane.cursojava.aula15;

/*
	Uma fruteira está vendendo frutas com a seguinte tabela de preços:

						   Até 5 Kg			    Acima de 5 Kg
		Morango 		R$ 2,50 por Kg 		   R$ 2,20 por Kg
		Maçã 			R$ 1,80 por Kg 		   R$ 1,50 por Kg
		
	Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
	compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
	Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) 
	de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o total de morangos (em Kg):");
		double kilosMorango = scan.nextDouble();
		
		System.out.println("Informe o total de maçãs (em Kg):");
		double kilosMaca = scan.nextDouble();
		
		double precoMorango = 0;
		if(kilosMorango <= 5) {
			precoMorango = 2.5;
		} else if(kilosMorango > 5) {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if(kilosMorango <= 5) {
			precoMaca = 1.8;
		} else if(kilosMaca > 5) {
			precoMaca = 1.5;
		}
		
		double precoParcial = precoMorango + precoMaca;
		double precoFinal = precoParcial;
		
		double desconto = 0;
		if((kilosMorango + kilosMaca > 8) || precoParcial > 25) {
			desconto = (precoParcial / 100) * 10;
		}
		
		precoFinal = precoParcial - desconto;
		
		System.out.printf("Valor a pagar: R$ %.2f", precoFinal);
	}

}
