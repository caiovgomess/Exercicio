package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um entrada inteiro: ");

		try {
			Integer entrada = sc.nextInt();

			verificaParidade(entrada);
			
		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}
	}
	
	public static void verificaParidade(Integer entrada) {
		if(entrada % 2 == 0) {
			System.out.println("Raiz quadrada do entrada: " + Math.sqrt(entrada));
		} else if(entrada % 2 != 0) {
			System.out.println("Raiz cubica do entrada: " + Math.pow(entrada, (1.0/3.0)));
		}
	}

}
