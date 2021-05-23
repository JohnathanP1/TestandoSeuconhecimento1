package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		/*O estatuto de uma ONG determina que todas as doações
recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade.
		*O valor do investimento deve ser de 5% da doação.
Porém, em casos em que as doações ultrapassem R$ 1000,00 o investimento deve ser 15% da doação.
	*Sua missão é criar um programa capaz de fazer os cálculos necessários e indicar quanto deve ser investido. */
		
		//Cria um Scanner
		Scanner leitor = new Scanner(System.in);
		//Cria uma variável doacao, investimento e usoImediato;
		double doacao, investimento, usoImediato;
		//Basta escrever investimento = 0; para corrigir o erro abaixo
		investimento = 0;
		usoImediato = 0;
		//Escreva uma linha de texto "Por favor, digite o valor da doação recebida!";
		System.out.println("Por favor, digite o valor da doação recebida!");
		//doacao = leitor.nextDouble();
		doacao = leitor.nextDouble();
		
		/*Aqui devemos criar uma solução para realizar os cálculos adequados baseando-nos no valor da doação */
		//Vamos criar a lógica >1000 ou <1000;
		//vamos criar uma condição if abaixo
		//O if abaixo tem uma parte verdadeira e outra falsa. caso o teste seja verdadeiro, a primeira parte é executada.
		//Caso contrário, a segunta parte é excecutada.
		if (doacao>=1000) {
			//verdadeira
		//Desafio agora você vai cálcular 5%  da doação
			//vamos escrevar a váriavel investimento = doação * 0.05;
			investimento = doacao * 0.05;
			//A lógica é o que ela recebeu - o que estou obrigando a investir
			usoImediato = doacao - investimento;
		
		//Agora vamos calcular 15%
		//não faz sentido se for maior que 1000
		//if (doacao >=1000) {
		//investimento = doacao * 0.15;
		//usoImediato = doacao - investimento
		//vamos utilizar o if composto o lado verdadeiro e o lado falso 
		}else {
			//falsa
			investimento = doacao * 0.15;
			usoImediato = doacao - investimento;
		
		}
		//Vamos resolver o problema abaixo:
		System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
		
		leitor.close();
	}

}
