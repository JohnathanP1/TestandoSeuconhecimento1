package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Vamos exercitar cria uma calculadora fazendo as contas de */-+
		Scanner leitor = new Scanner(System.in);

		
		//Eu criei um programa que faz todos os c�lculos de acordo com o algoritmo , uma calculadora
		//Fa�a uma calculadora voc� tem 5 minutos para fazer
		
		double primeiroValor;
		double segundoValor;
		double soma , multiplicacao , subtracao , divisao;
		System.out.println("Por favor, digite um valor ");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite um segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores � " + multiplicacao);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores � " + subtracao);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores � " + divisao);
		System.out.println("Parab�ns voc� criou uma calculadora");
		
		
		
		
	
		leitor.close();
		
	}

}
