package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class OperadorOu2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//cria uma variável double totalCompra, valorFinal = 0.0;
		double totalCompra, valorFinal = 0.0;
		//Cria uma double total de Compra , valorFinal = 0.0; com cupom de desconto
		
		String cupom;
		//Cria uma String cupom
		System.out.println("Sistem de desconto");
		//escreva um texto sistema de desconto lembrando usando sysout
		System.out.println("digite o valor total da compra");
		//escreva um texto por favor, digite o valor total da compra lembrando usando sysout
		totalCompra = leitor.nextDouble();
		//escreva um leitor abaixo totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite seu cupom");
		//Por favor digite seu cupom sysout
		cupom = leitor.next();
		//cupom = leitor.next();
		if (totalCompra > 1000 || cupom.equals ("DESCONTO20")) {
		//Aqui é preciso criar um if que verifique as duas condições para que o desconto seja ou não aplicado
		//if (totalCompra > 1000 Ou cupom.equals ("DESCONTO20")) {
			
			//Se não for satisfeita teste se for falso else
		}else {
			valorFinal = totalCompra * 0.8;
			//valorFinal = totalCompra * dois valores 0.0;
		
			
		}
			
		
		System.out.println("O valor final R$ é " + valorFinal);
		//Escreva no texto ("O valor final R$ é "  + valorFinal)
		
			
			
			leitor.close();
		}
			
	}


