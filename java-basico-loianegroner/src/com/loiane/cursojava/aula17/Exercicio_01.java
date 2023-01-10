package com.loiane.cursojava.aula17;

/*
	Faça um programa que peça uma nota, entre zero e dez. Mostre uma
	mensagem caso o valor seja inválido e continue pedindo até que o
	usuário informe um valor válido.
*/

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		boolean ehValida = false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!ehValida) {
			
			System.out.println("Informe uma nota entre 0-Zero e 10-Dez:");
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				ehValida = true;
				System.out.println("Nota informada: " + nota);
			} else {
				System.out.println("Valor inválido!");
			}
			
		}	
		
	}

}
