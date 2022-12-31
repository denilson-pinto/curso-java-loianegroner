package com.loiane.cursojava.aula15;

/*
	Faça um Programa que pergunte em que turno você estuda. Peça
	para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
	mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
	Inválido!", conforme o caso.
*/

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o turno de estudo (M-Matutino, V-Vespertino ou N-Noturno):");
		String turno = scan.nextLine();
		
		if (turno.length() > 1) System.out.println("Valor Inválido!");
		else {
			switch (turno.toUpperCase()) {
			case "M": System.out.println("Bom Dia"); break;
			case "V": System.out.println("Boa Tarde!"); break;
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Valor Inválido!");
			}
		}
	}

}
