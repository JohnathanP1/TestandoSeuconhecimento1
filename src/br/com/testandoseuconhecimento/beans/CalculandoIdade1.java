package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class CalculandoIdade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// Por favor, cria um programa calculando a idade
		//Voc� tem 5 minutos para fazer esse projeto
		
		 int idade;
		 //Toda vez que for exibir um texto, favor fechar acionando o leitor.next() nesse caso depende da vari�vel que voc� criou..
		 System.out.println("Por favor, digite a sua idade");
		 idade = leitor.nextInt();
		 System.out.println("Deixe-me, verificar a sua idade");
		 if(idade>=12) {
		 
		 
		 System.out.println("Voc� pode jogar!!");
		 Scanner leitor1 = new Scanner(System.in);
		 
		 //Essa vari�vel int � um n�mero inteiro eu usei int + ano para mencionar o n�mero dentro do println
		 int ano;
		 System.out.println("Por favor, digite o ano do seu nascimento");
		 ano = leitor.nextInt();
		 
		 
		 //Para simplificar e entender melhor, eu criei uma vari�vel para somar na l�gica 
		 // o sinal de + executa o c�lculo da l�gica programa��o
		 ano = 2021 - idade;
		 System.out.println("Que legal , pelo que eu vi a sua idade � " + idade);
		 if(idade>=18) {
		

		leitor.close();
		
		
		 }
		 }
	}

}
