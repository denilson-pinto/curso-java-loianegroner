package com.loiane.cursojava.aula17;

/*
 Faça um programa que leia e valide as seguintes informações:

	a. Nome: maior que 3 caracteres;
	b. Idade: entre 0 e 150;
	c. Salário: maior que zero;
	d. Sexo: 'f' ou 'm';
	e. Estado Civil: 's', 'c', 'v', 'd'; 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String formato = "R$ #,##0.00";
		DecimalFormat df = new DecimalFormat(formato);
		
		boolean ehValido = false;
		
		String nome, sexo, estadoCivil;
		int idade = 0;
		double salario = 0;
		
		do {
			System.out.println("Informe o nome:");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				ehValido = true;
			} else {
				System.out.println("Necessário o nome ter no mínimo 3 caracteres.");
				System.out.println("----------------------------------------------");
			}
			
		} while(!ehValido);
		
		ehValido = false;
		
		do {
		 
			System.out.println("Informe a idade:");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				ehValido = true;
			} else {
				System.out.println("É necessário que a idade seja entre 0 e 150.");
				System.out.println("----------------------------------------------");
			}
			
		} while(!ehValido);
		
		ehValido = false;
		
		do {
			
			System.out.println("Informe o salário:");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				ehValido = true;
			} else {
				System.out.println("É necessário que o salário seja maior que zero.");
				System.out.println("----------------------------------------------");
			}
			
		} while(!ehValido);
		
		ehValido = false;
		
		do {
			
			System.out.println("Informe o sexo:");
			sexo = scan.next();
			
			if(sexo.length() == 1 && (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))) {
				ehValido = true;
			} else {
				System.out.println("Valor inválido. Entre com F ou M para informar o sexo.");
				System.out.println("-------------------------------------------------------");
			}
			
		} while(!ehValido);
		
		ehValido = false;
		
		do {
			
			System.out.println("Informe o Estado Civil (S - Solteiro(a), C - Casado(a), V - Viúvo(a), D - Divorciado(a)):");
			estadoCivil = scan.next();
			
			if(estadoCivil.length() == 1 && 
				estadoCivil.equalsIgnoreCase("S") ||
				estadoCivil.equalsIgnoreCase("C") ||
				estadoCivil.equalsIgnoreCase("V") ||
				estadoCivil.equalsIgnoreCase("D")) {
				
				ehValido = true;
			} else {
				System.out.println("Valor inválido. É necessário informar o Estado Civil ('S','C', 'V', 'D'):");
				System.out.println("--------------------------------------------------------------------------");
			}
			
		} while(!ehValido);
		
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALÁRIO: " + df.format(salario));
		System.out.println("SEXO: " + sexo);
		System.out.println("ESTADO CIVIL: " + estadoCivil);

	}

}
