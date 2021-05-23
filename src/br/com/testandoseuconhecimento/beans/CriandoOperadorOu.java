package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class CriandoOperadorOu {

	public static void main(String[] args) {
		// cria um operador ou || fazendo as somas com cupom de desconto, total de
		// compra e valor final
		Scanner leitor = new Scanner(System.in);

		double totalCompra , valorFinal = 0.0;
		String cupom;
		System.out.println("Por favor, digite o valor total da compra");
		totalCompra = leitor.nextDouble();
		
		System.out.println("Por favor, digite o seu cupom");
		cupom = leitor.next();
		
		if(totalCompra > 1000 || cupom.equalsIgnoreCase("DESCONTO20")) {
		valorFinal = totalCompra * 0.08;
		
		System.out.println("O valor final de R$ é " + valorFinal);
		valorFinal = leitor.nextDouble();
		System.out.println("Parabéns você acabou de ganhar um desconto");
		
		leitor.close();
		
		}
		}

	}

