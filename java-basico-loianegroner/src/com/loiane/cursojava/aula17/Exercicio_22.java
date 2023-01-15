package com.loiane.cursojava.aula17;

/*
  Faça um programa que calcule o valor total investido por um
  colecionador em sua coleção de CDs e o valor médio gasto em cada
  um deles. O usuário deverá informar a quantidade de CDs e o valor
  para cada um.
*/

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CDs:");
		int cds = scan.nextInt();
		
		System.out.println("-----------------------------");
		double preco = 0;
		double precoTotal = 0;
		double media = 0;
		
		for(int i = 0; i < cds; i++) {
			System.out.println("Informe o preço do " + (i + 1) + "º CD:");
			preco = scan.nextDouble();
			
			precoTotal += preco;
		}
		
		media = precoTotal / cds;
		
		System.out.println("------------------------------------------");
		System.out.printf("Preço total da coleção de CDs: R$ %.2f", precoTotal);
		System.out.printf("\nPreço médio de cada CD: R$ %.2f", preco);
		
	}

}
