package com.loiane.cursojava.aula15;

//	Faça um Programa que leia três números e mostre-os em ordem decrescente.

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número:");
		int num3 = scan.nextInt();
		
		//número 1 o maior, número 3 o menor
		if((num1 >= num2) && (num1 >= num3) && (num2 >= num3)) System.out.println("Ordem Decrescente: " + num1 + " - " + num2 + " - " + num3);
		//número 1 o maior, número 2 o menor
		else if((num1 >= num2) && (num1 >= num3) && (num3 >= num2)) System.out.println("Ordem Decrescente: " + num1 + " - " + num3 + " - " + num2);
		//número 2 o maior, número 1 o menor
		else if((num2 >= num1) && (num2 >= num3) && (num3 >= num1)) System.out.println("Ordem Decrescente: " + num2 + " - " + num3 + " - " + num1);
		//número 2 o maior, número 3 o menor
		else if((num2 >= num1) && (num2 >= num3) && (num1 >= num3)) System.out.println("Ordem Decrescente: " + num2 + " - " + num1 + " - " + num3);
		//número 3 o maior, número 1 o menor
		else if((num3 >= num1) && (num3 >= num2) && (num2 >= num1)) System.out.println("Ordem Decrescente: " + num3 + " - " + num2 + " - " + num1);
		//número 3 o maior, número 2 o menor
		else if((num3 >= num1) && (num3 >= num2) && (num1 >= num2)) System.out.println("Ordem Decrescente: " + num3 + " - " + num1 + " - " + num2);
	}

}
