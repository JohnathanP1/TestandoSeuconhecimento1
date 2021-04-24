package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class CalculandoIdade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		System.out.println("Por favor, digite sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Deixe-me , verifica sua idade!");
		if (idade>=12);
		
		System.out.println("Você pode Jogar!");
		Scanner leitor1 = new Scanner(System.in);
		int ano;
		
		System.out.println("Por favor , digite data do seu nascimento");
		ano = leitor.nextInt();
		
		System.out.println("Que legal, você nasceu em " + ano);
		ano = 2021 - idade;
		
		System.out.println("Pelo que eu vi, você nasceu em " + idade);
		if (idade>=18);
		
		
		leitor.close();
		
	}

}
