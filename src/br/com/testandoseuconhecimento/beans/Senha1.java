package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class Senha1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String usuario , senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		
		System.out.println("Por favor , digite sua senha");
		senha = leitor.next();

		if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Usuário Logado!");
		}else {
			System.out.println("Usuário ou senha incorretos");
			
			
			
			leitor.close();
			
		}
		
		}

}
