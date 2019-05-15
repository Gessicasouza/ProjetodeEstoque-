package com.br.ola.mundo;

import java.util.Scanner;

public class CapacidadeMedia {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Qual é a capacidade Maxima no Estoque?");
	    long maximoDeProdutos = Input.nextLong();
	    
	    System.out.println("Qual é a capacidade Minima no Estoque?");
		long minimoDeProdutos = Input.nextLong();
		
		System.out.println("Que valor pode ser Dividido?");
		long mediaDeEstoque = (maximoDeProdutos + minimoDeProdutos)/Input.nextLong();
 
		System.out.println("A Média de Produtos no Estoque é:" +  mediaDeEstoque  );
	}

}
