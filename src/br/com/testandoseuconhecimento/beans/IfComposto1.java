package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class IfComposto1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double doacao, investimento , usoImediato;
		investimento = 0;
		usoImediato = 0;
		
		System.out.println("Por favor, digite o valor da doação recebida!!");
		doacao = leitor.nextDouble();
		
		if (doacao>1000) {
			investimento = doacao * 0.08;
			usoImediato = doacao - investimento;
			
			
		}else {
			investimento = doacao * 0.20;
			usoImediato = doacao - investimento;
		}
				

			System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
			
		
		
		leitor.close();
		}
	}


