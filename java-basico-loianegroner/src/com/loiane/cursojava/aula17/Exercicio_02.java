package com.loiane.cursojava.aula17;

/*
  Faça um programa que leia um nome de usuário e a sua senha e não
  aceite a senha igual ao nome do usuário, mostrando uma mensagem
  de erro e voltando a pedir as informações.
*/

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean ehValido = false;
		
		String user;
		String password;
		
		do {
			System.out.println("Informe o usuário:");
			user = scan.next();
			
			System.out.println("Informe a senha:");
			password = scan.next();
			
			if(!(user.equalsIgnoreCase(password))) {
				ehValido = true;
				System.out.println("Credenciais válidas.");
			} else {
				System.out.println("Credenciais inválidas. Usuário e senha não podem ser iguais.");
				System.out.println("------------------------------------------------------------");
			}
			
		} while(!ehValido);

	}

}
