package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class OperadorOu2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double totalCompra , valorFinal = 0.0;
		//Cria uma double total de Compra , valorFinal = 0.0; com cupom de desconto
		
		String cupom;
		//Cria uma String cupom
		System.out.println("Sistema de desconto");
		//escreva um texto sistema de desconto lembrando usando sysout
		System.out.println("Por favor, digite o valor total da compra");
		//escreva um texto por favor, digite o valor total da compra lembrando usando sysout
		totalCompra = leitor.nextDouble();
		//escreva um leitor abaixo totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite seu cupom");
		//Por favor digite seu cupom sysout
		cupom = leitor.next();
		//cupom = leitor.next();
		if (totalCompra > 1000 || cupom.equalsIgnoreCase ("DESCONTO20")) {
		//Aqui � preciso criar um if que verifique as duas condi��es para que o desconto seja ou n�o aplicado
		//if (totalCompra > 1000 Ou cupom.equals ("DESCONTO20")) {
			valorFinal = totalCompra * 0.7;
			//valorFinal = totalCompra * dois valores 0.0;
			
			
		
		System.out.println("O valor final R$ � " + valorFinal);
		//Escreva no texto ("O valor final R$ � "  + valorFinal)
		
			
			leitor.close();
			
		}
			
	}

}
