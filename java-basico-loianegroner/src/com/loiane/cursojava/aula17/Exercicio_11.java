package com.loiane.cursojava.aula17;

import java.util.Scanner;

//	Altere o programa anterior para mostrar no final a soma dos números.

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		if (num1 == num2) {
			System.out.println("Os números precisam ser diferentes!");
		} else if (num1 > num2) {
			num1 += num2;
			num2 = num1 - num2;
			num1 -= num2;
		}

		for (int i = num1; i <= num2; i++) {
			if (num1 != num2) System.out.print(i + " ");
			
			soma += i;
		}
		
		if(num1 != num2) System.out.println("\nSoma: " + soma);
		
	}

}
