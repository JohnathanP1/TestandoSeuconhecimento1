package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Vamos exercitar cria uma calculadora fazendo as contas de */-+
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma , multiplicacao , divisao , subtracao;
		
		
		
		System.out.println("Por favor , digite um valor");
		//Lembrando quando 1 vari�vel for double nextDouble se for Int nextInt e texto leitor.next
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor , digite um segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores � " + multiplicacao);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores � " + divisao);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores � " + subtracao);

		//Well Done!!
		leitor.close();
	}

}
