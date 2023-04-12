package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome e sobrenome");

		try {
			String nomeCompleto = sc.nextLine();
			verificaNome(nomeCompleto);

		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}
	}
	
	public static void verificaNome(String nomeCompleto) {
		String[] nomeCompletoArray = nomeCompleto.split(" ");
		String nome = nomeCompletoArray[0];
		String sobrenome = nomeCompletoArray[1];
		
		if(sobrenome.equals("Wayne")) {
			System.out.println("Acesso liberado, Sr. Wayne");
		}
		
		if(sobrenome.equals("Kent")) {
			System.out.println("Sai dai, mane!");
		}
		
		if(nome.equals("Diana")) {
			System.out.println("Bem-vinda, Princesa de Themyscara");
		}
		
		if(!sobrenome.equals("Wayne") && !sobrenome.equals("Kent") && !nome.equals("Diana")) {
			System.out.println("Cai fora!");
		}
		
	}

}
