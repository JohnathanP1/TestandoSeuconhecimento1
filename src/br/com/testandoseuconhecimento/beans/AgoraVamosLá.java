package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class AgoraVamosL� {

	public static void main(String[] args) {
		//Cria um if composto com vari�vel doa��o , investimento e uso imediato
		Scanner leitor = new Scanner(System.in);
		
		
		//Cria uma variavel double com nomes doa��o, investimento e uso imediato
		double doacao, investimento, usoImediato;
		
		investimento = 0;
		usoImediato = 0;
		//Agora voc� cria um texto, "Por favor, digite o valor da doa��o recebida!";
		System.out.println("Por favor, digite o valor da doa��o recebida!");
		doacao = leitor.nextDouble();
		
		//cria uma doa��o >1000 com if verdadeiro
		if (doacao>=1000) {
		//Investimento = doa��o multiplica 5%
		investimento = doacao * 0.05;
		usoImediato = doacao - investimento;
		
		//Agora vamos calcular 15%
		//Cria um if falso
		}else {
		investimento = doacao * 0.15;
		usoImediato = doacao - investimento;
		}
		//Vamos digitar um texto
		//"A doa��o de R$" + doacao + "implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + " para uso imediato");
		System.out.println("A doa��o de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
		
		
		
		leitor.close();
	}

}
