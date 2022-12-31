package com.loiane.cursojava.aula13;

/*
	Faça um Programa que peça um número e então mostre a
	mensagem O número informado foi [número].
*/

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi: " + numero);

	}

}
