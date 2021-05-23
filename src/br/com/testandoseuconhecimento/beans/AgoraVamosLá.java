package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class AgoraVamosLá {

	public static void main(String[] args) {
		//Cria um if composto com variável doação , investimento e uso imediato
		Scanner leitor = new Scanner(System.in);
		
		
		//Cria uma variavel double com nomes doação, investimento e uso imediato
		double doacao, investimento, usoImediato;
		
		investimento = 0;
		usoImediato = 0;
		//Agora você cria um texto, "Por favor, digite o valor da doação recebida!";
		System.out.println("Por favor, digite o valor da doação recebida!");
		doacao = leitor.nextDouble();
		
		//cria uma doação >1000 com if verdadeiro
		if (doacao>=1000) {
		//Investimento = doação multiplica 5%
		investimento = doacao * 0.05;
		usoImediato = doacao - investimento;
		
		//Agora vamos calcular 15%
		//Cria um if falso
		}else {
		investimento = doacao * 0.15;
		usoImediato = doacao - investimento;
		}
		//Vamos digitar um texto
		//"A doação de R$" + doacao + "implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " para uso imediato");
		System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
		
		
		
		leitor.close();
	}

}
