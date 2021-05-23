package br.com.testandoseuconhecimento.beans;



import java.text.DecimalFormat;
import java.util.Scanner;

public class Divisao40 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("##.00");
		
	
		double resultado = 46.23340;
		
		System.out.println(formatador.format(resultado));
		
		
		
		
		
		
		//agora eu vou formatar uma casa decimal
		leitor.close();
		
	}
	
}
