package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class OperadorE0 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// No operador lógico eu vou criar um login com senha , para isso eu preciso
		// criar uma string

		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor digite seu username:");
		usuario = leitor.next();
		
		System.out.println("Por favor, digite a sua senha:");
		senha = leitor.next();
		
		if(usuario.equalsIgnoreCase("ADMIN")) {
			if(senha.equals("123")) {
				System.out.println("Usuario Logado!!");
			}else {
				System.out.println("Usuario ou senha incorretos");
			}
		}
		
		
		
		
		
		
		
		
			
		
	}

}