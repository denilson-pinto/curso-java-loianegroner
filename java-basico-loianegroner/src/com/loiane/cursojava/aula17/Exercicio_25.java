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
  Total: R$ 9.00
  Dinheiro: R$ 20.00
  Troco: R$ 11.00
  ...
*/

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int produtos = 1;
		double preco = 0.01;
		double total = 0;
		double dinheiro = 0;
		double troco = dinheiro - total;
		boolean sair = false;
		String resposta;
		
		System.out.println("Lojas Tabajara");
		
		do {
			System.out.println("\nDeseja registrar uma nova compra ? (S/N)");
			resposta = scan.next();

			if (resposta.equalsIgnoreCase("S")) {

				for (int i = 0; i < produtos; i++) {
					System.out.print("\nProduto " + (i + 1) + ":");
					preco = scan.nextDouble();

					System.out.printf("R$ %.2f", preco);

					produtos++;
					total += preco;
				}

			} else if (preco == 0 || resposta.equalsIgnoreCase("N")) {
				sair = true;
			}
			
		} while(!sair);
		
		/*while(preco != 0) {
			
			//produtos++;
			for(int i = 0; i < produtos; i++) {
				preco = scan.nextDouble();
				System.out.printf("\nProduto " + (i + 1) + ": R$ %.2f", preco);
				
				
				//System.out.printf(" R$ %.2f", preco);
			}
			
			total += preco;
		}*/
		
		System.out.printf("\nTotal: R$ %.2f", total);
		System.out.printf("\nDinheiro: R$ %.2f", dinheiro);
		dinheiro = scan.nextDouble();
		
		System.out.printf("\nTroco: R$ %.2f", troco);
	}

}
