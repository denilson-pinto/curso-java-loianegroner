package com.loiane.cursojava.aula17;

/*
  O Sr. Manoel Joaquim expandiu seus negócios para além dos
  negócios de 1,99 e agora possui uma loja de conveniências. Faça um
  programa que implemente uma caixa registradora rudimentar. O
  programa deverá receber um número desconhecido de valores
  referentes aos preços das mercadorias. Um valor zero deve ser
  informado pelo operador para indicar o final da compra. O programa
  deve então mostrar o total da compra e perguntar o valor em dinheiro
  que o cliente forneceu, para então calcular e mostrar o valor do troco.
  Após esta operação, o programa deverá voltar ao ponto inicial, para
  registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
  
  Lojas Tabajara
  Produto 1: R$ 2.20
  Produto 2: R$ 5.80
  Produto 3: R$ 0
  Total: R$ 8.00
  Dinheiro: R$ 20.00
  Troco: R$ 12.00
  ...
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int itens = 1;
		double preco = 0.01;
		double total = 0;
		double dinheiro = 0;
		double troco = dinheiro - total;
		boolean sair = false;
		String resposta;
		String mensagemCompra;
		
		String formato = "R$ #,##0.00";
		DecimalFormat df = new DecimalFormat(formato);
		
		do {
			System.out.println("\nDeseja registrar uma nova compra ? (S/N)");
			resposta = scan.next();

			if(resposta.length() > 1) {
				System.out.println("Valor inválido!");
			} else if (resposta.equalsIgnoreCase("S")) {

				mensagemCompra = "Lojas Tabajara\n";
				
				System.out.println("Informe a quantidade de itens:");
				itens = scan.nextInt();
				
				for (int i = 1; i <= itens; i++) {
					System.out.println("Produto " + i + ": ");
					preco = scan.nextDouble();
					
					total += preco;
					
					mensagemCompra += "Produto " + i + ": " + df.format(preco) + "\n";
				}
				
				mensagemCompra += "Total: " + df.format(total) + "\n";
				
				System.out.printf(mensagemCompra);
				
				System.out.printf("Valor pago em dinheiro: \n");
				dinheiro = scan.nextDouble();
				
				mensagemCompra += "Dinheiro: " + df.format(dinheiro);
				
				troco = dinheiro - total;
				
				mensagemCompra += "\nTroco: " + df.format(troco);
				
				System.out.println(mensagemCompra);

			} else {
				sair = true;
			}
			
		} while(!sair);
		
	}

}
