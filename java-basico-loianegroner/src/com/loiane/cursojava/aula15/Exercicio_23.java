package com.loiane.cursojava.aula15;

/*
	O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

							Até 5 Kg		 Acima de 5 Kg
		File Duplo 		R$ 4,90 por Kg 		R$ 5,80 por Kg
		Alcatra 		R$ 5,90 por Kg 		R$ 6,80 por Kg
		Picanha 		R$ 6,90 por Kg 		R$ 7,80 por Kg

	Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de 
	carne da promoção, porém não há limites para a quantidade de carne por cliente. 
	Se a compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% 
	sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne 
	comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: 
	tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. 
 */

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoCarne = 0;
		double kilosCarne = 0;
		
		boolean valido = true;
		
		System.out.println("Informe o tipo de carne (1-File Duplo, 2-Alcatra, 3-Picanha):");
		int tipoCarne = scan.nextInt();
		
		String str1 = Integer.toString(tipoCarne);
		
		if(str1.length() > 1 || tipoCarne > 3) {
			System.out.println("Tipo inválido!");
			valido = false;
		} else {
			System.out.println("Informe o total de carne (Em Kg):");
			kilosCarne = scan.nextDouble();
			
			if(tipoCarne == 1) {
				
				if(kilosCarne <= 5) precoCarne = 4.9;
				else if(kilosCarne > 5) precoCarne = 5.8;
				System.out.println(kilosCarne + " Kg - File Duplo");
				
			} else if(tipoCarne == 2) {
				
				if(kilosCarne <= 5) precoCarne = 5.9;
				else if(kilosCarne > 5) precoCarne = 6.8;
				System.out.println(kilosCarne + " Kg - Alcatra");
				
			} else if(tipoCarne == 2) {
				
				if(kilosCarne <= 5) precoCarne = 6.9;
				else if(kilosCarne > 5) precoCarne = 7.8;
				System.out.println(kilosCarne + " Kg - Picanha");
				
			}
		}
		
		if (valido) {
			double precoTotal = kilosCarne * precoCarne;
			System.out.printf(kilosCarne + " Kg * " + precoCarne + " = R$ %.2f", precoTotal);

			System.out.println("\nInforme a forma de pagamento (1-Cartão Tabajara, 2-Pix, 3-Dinheiro):");
			int pagamento = scan.nextInt();

			String str2 = Integer.toString(pagamento);

			double desconto = 0;

			if (str2.length() > 1 || pagamento > 3) {
				System.out.println("Valor inválido!");
				valido = false;
			} else if (pagamento == 1) {
				
				desconto = (precoTotal / 100) * 5;
				System.out.println("######################################################################");
				System.out.println("Forma de Pagamento: Cartão Tabajara");
				System.out.printf("Valor do desconto: R$ %.2f", desconto);
				
			} else if (pagamento == 2) {
				
				System.out.println("######################################################################");
				System.out.println("Forma de Pagamento: Pix");
				System.out.println("Sem desconto");
				
			} else if (pagamento == 3) {
				
				System.out.println("######################################################################");
				System.out.println("Forma de Pagamento: Dinheiro");
				System.out.println("Sem desconto");
				
			}

			if (valido) {
				double valorFinal = precoTotal - desconto;
				System.out.printf("\nValor a pagar: R$ %.2f", valorFinal);
			}

		}
	}

}
