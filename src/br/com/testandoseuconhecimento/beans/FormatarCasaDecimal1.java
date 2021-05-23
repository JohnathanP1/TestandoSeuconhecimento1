package br.com.testandoseuconhecimento.beans;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatarCasaDecimal1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = DecimalFormat("##.00");
	
		
		double resultado = 40.000;
		
		System.out.println(formatador.format(resultado));
		
		
		
		
		
	}

}
