package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		//O scanner leitor � capaz de fazer uma leitura em seu c�digo
		Scanner leitor = new Scanner(System.in);
		
		String nomeUsuario;
		
		System.out.println("Por favor , escreva seu nome");
		nomeUsuario = leitor.next();
		
		
		System.out.println("Obrigado por utilizar meu programa," + nomeUsuario );
		

		
		
		
		leitor.close();
		
	}

}
