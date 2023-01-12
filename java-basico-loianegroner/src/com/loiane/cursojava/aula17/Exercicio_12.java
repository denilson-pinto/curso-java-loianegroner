package com.loiane.cursojava.aula17;

/*
  Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
  qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
  número ele deseja ver a tabuada. A saída deve ser conforme o
  exemplo abaixo:
  
  Tabuada de 5:
  5 X 1 = 5
  5 X 2 = 10
  ...
  5 X 10 = 50
  
*/

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número entre 1 e 10:");
		int numero = scan.nextInt();
		
		int resultado;
		
		if(numero < 1 || numero > 10) {
			System.out.println("Valor inválido! Número precisa ser entre 1 e 10.");
		} else {
			System.out.println("Tabuada de " + numero + ":");
			
			for(int i = 1; i <= 10; i++) {
				resultado = numero * i;
				System.out.println(numero + " X " + i + " = " + resultado);
			}
		}
		

	}

}
