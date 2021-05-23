package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Vamos exercitar cria uma calculadora fazendo as contas de */-+
		Scanner leitor = new Scanner(System.in);

		
		//Eu criei um programa que faz todos os cálculos de acordo com o algoritmo , uma calculadora
		//Faça uma calculadora você tem 5 minutos para fazer
		
		double primeiroValor;
		double segundoValor;
		double soma , multiplicacao , subtracao , divisao;
		System.out.println("Por favor, digite um valor ");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite um segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é " + soma);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores é " + multiplicacao);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores é " + subtracao);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores é " + divisao);
		System.out.println("Parabéns você criou uma calculadora");
		
		
		
		
	
		leitor.close();
		
	}

}
