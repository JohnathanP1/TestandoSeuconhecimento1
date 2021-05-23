package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class OperadorOu0 {

	public static void main(String[] args) {
		//Aqui você vai criar um programa que faz os calculos de porcentagem com sistema de desconto e cupom
		//vamos praticar??
		Scanner leitor = new Scanner(System.in);
		
		
		double totalCompra, valorFinal = 0.0;
		String cupom;
		System.out.println("SISTEMA DE DESCONTO");
		System.out.println("Por favor, digite o valor total de compra");
		totalCompra = leitor.nextDouble();
		
		System.out.println("Por favor, digite seu cupom de desconto");
		cupom = leitor.next();
		
		if (totalCompra < 1000 || cupom.equalsIgnoreCase("DESCONTO20")) {
		valorFinal = totalCompra * 0.12;
	
		
		
		System.out.println("O valor final de R$ é " + valorFinal);
		
	
		
		
		
		
		
		
		
		
		
		
		
			leitor.close();
		}
		
	}
}