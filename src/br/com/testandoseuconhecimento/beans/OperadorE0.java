package br.com.testandoseuconhecimento.beans;

import java.util.Scanner;

public class OperadorE0 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
		
			String usuario, senha;
			System.out.println("SISTEMA DE LOGIN");
			System.out.println("Por favor, digite seu username:");
			usuario = leitor.next();
			
			System.out.println("Por favor, digite sua senha:");
			senha = leitor.next();
			
			//Agora vamos cria apenas 1 if usando uma técnica e ignora letras minuscula
			if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			
			System.out.println("Usuario Logado!");
				}else {
					System.out.println("Usuário ou senha incorretos");
				
				
				
					
					
					
					
					
					leitor.close();
			}
			}
			
			
				
		
		
	}	
		



