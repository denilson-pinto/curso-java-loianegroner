package com.loiane.cursojava.aula15;

/*
	Faça um programa que pergunte o preço de três produtos e informe
	qual produto você deve comprar, sabendo que a decisão é sempre
	pelo mais barato.
*/

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preço do primeiro produto:");
		Double prod1 = scan.nextDouble();
		
		System.out.println("Preço do segundo produto:");
		Double prod2 = scan.nextDouble();
		
		System.out.println("Preço do terceiro produto:");
		Double prod3 = scan.nextDouble();
		
		if(prod1 < prod2 && prod1 < prod3) System.out.println("Compre o produto 1");
		else if(prod2 < prod1 && prod2 < prod3) System.out.println("Compre o produto 2");
		else System.out.println("Compre o produto 3");
	}

}
