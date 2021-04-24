package br.com.testandoseuconhecimento.beans;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Divisao40 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double resultado = 45.12999;
								
		DecimalFormat formatador = new DecimalFormat("##.00");		
		System.out.println(formatador.format(resultado));
		
		
		
		
		
		leitor.close();
	}

}
