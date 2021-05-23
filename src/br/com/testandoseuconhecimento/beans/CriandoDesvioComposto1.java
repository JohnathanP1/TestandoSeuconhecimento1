package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class CriandoDesvioComposto1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//cria um desvio composto um if simples 
	
		double investimento , doacao , usoImediato;
		investimento = 0;
		usoImediato = 0;
		
		System.out.println("Por favor, digite o valor da doação recebida!!");
		doacao = leitor.nextDouble();
		
		if(doacao>=1000) {
			investimento = doacao * 0.05;
			usoImediato = doacao - investimento;
			
		}else {
			investimento = doacao * 0.15;
			usoImediato = doacao - investimento;
			
		}
		
		
			
			
		
			System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento + ", restando R$" + usoImediato +  " para uso imediato");
			//System.out.println("A doação de R$" + doacao + "implica em um investimento de R$" + investimento + ", restando R$" + usoImediato + "para uso imediato");
			
			
			leitor.close();
		}
	}


