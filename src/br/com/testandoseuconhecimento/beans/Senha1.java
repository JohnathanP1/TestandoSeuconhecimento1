package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class Senha1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username");
		usuario = leitor.next();
		
		System.out.println("Por favor, digita sua senha");
		senha = leitor.next();
		
		if (usuario.equals("administrador")) {
		
			if (senha.equals("123")) {
			
				System.out.println("Usuario Logado!!");
	
			}else{
				System.out.println("Usuarios ou senha incorretos");
			
			
			
			
			}
		
	}
		
	}
	
}

