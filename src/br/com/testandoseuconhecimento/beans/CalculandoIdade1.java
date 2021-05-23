package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class CalculandoIdade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Por favor, cria um programa calculando a idade
		//Você tem 5 minutos para fazer esse projeto
		
		 int idade;
		 //Toda vez que for exibir um texto, favor fechar acionando o leitor.next() nesse caso depende da variável que você criou..
		 System.out.println("Por favor, digite a sua idade");
		 idade = leitor.nextInt();
		 System.out.println("Deixe-me, verificar a sua idade");
		 if(idade>=12) {
		 
		 
		 System.out.println("Você pode jogar!!");
		 Scanner leitor1 = new Scanner(System.in);
		 
		 //Essa variável int é um número inteiro eu usei int + ano para mencionar o número dentro do println
		 int ano;
		 System.out.println("Por favor, digite o ano do seu nascimento");
		 ano = leitor.nextInt();
		 
		 
		 //Para simplificar e entender melhor, eu criei uma variável para somar na lógica 
		 // o sinal de + executa o cálculo da lógica programação
		 ano = 2021 - idade;
		 System.out.println("Que legal , pelo que eu vi a sua idade é " + idade);
		 if(idade>=18) {
		

		leitor.close();
		
		
		 }
		 }
	}

}
