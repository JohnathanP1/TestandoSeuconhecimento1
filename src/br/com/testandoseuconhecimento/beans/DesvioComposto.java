package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class DesvioComposto {

	public static void main(String[] args) {
		/*O estatuto de uma ONG determina que todas as doa��es
recebidas devem gerar um valor para investimento, para cobrir momentos de necessidade.
		*O valor do investimento deve ser de 5% da doa��o.
Por�m, em casos em que as doa��es ultrapassem R$ 1000,00 o investimento deve ser 15% da doa��o.
	*Sua miss�o � criar um programa capaz de fazer os c�lculos necess�rios e indicar quanto deve ser investido. */
		
		//Cria um Scanner
		Scanner leitor = new Scanner(System.in);
		//Cria uma vari�vel doacao, investimento e usoImediato;
		double doacao, investimento, usoImediato;
		//Basta escrever investimento = 0; para corrigir o erro abaixo
		investimento = 0;
		usoImediato = 0;
		//Escreva uma linha de texto "Por favor, digite o valor da doa��o recebida!";
		System.out.println("Por favor, digite o valor da doa��o recebida!");
		//doacao = leitor.nextDouble();
		doacao = leitor.nextDouble();
		
		/*Aqui devemos criar uma solu��o para realizar os c�lculos adequados baseando-nos no valor da doa��o */
		//Vamos criar a l�gica >1000 ou <1000;
		//vamos criar uma condi��o if abaixo
		//O if abaixo tem uma parte verdadeira e outra falsa. caso o teste seja verdadeiro, a primeira parte � executada.
		//Caso contr�rio, a segunta parte � excecutada.
		if (doacao>=1000) {
			//verdadeira
		//Desafio agora voc� vai c�lcular 5%  da doa��o
			//vamos escrevar a v�riavel investimento = doa��o * 0.05;
			investimento = doacao * 0.05;
			//A l�gica � o que ela recebeu - o que estou obrigando a investir
			usoImediato = doacao - investimento;
		
		//Agora vamos calcular 15%
		//n�o faz sentido se for maior que 1000
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
		System.out.println("A doa��o de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
		
		leitor.close();
	}

}
