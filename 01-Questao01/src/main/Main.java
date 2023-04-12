package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o calculo que deseja fazer: ");
		System.out.println("1: Adicao \n" + "2: Subtracao \n" + "3: Divisao \n" + "4: Multiplicacao \n"
				+ "5: Raiz quadrada e raiz cubica\n" + "6: Todas as operacoes");

		try {
			Integer calculo = sc.nextInt();

			if (calculo < 0 || calculo > 6) {
				System.out.println("Entrada invalida");
			} else {
				System.out.println("Digite dois numeros: ");

				double n1 = sc.nextDouble();
				double n2 = sc.nextDouble();

				switch (calculo) {
				case 1:
					calculoDaSoma(n1, n2);
					break;
				case 2:
					calculoDaSubtracao(n1, n2);
					break;
				case 3:
					calculoDaDiv(n1, n2);
					break;
				case 4:
					calculoDaMult(n1, n2);
					break;
				case 5:
					calculoDaPotencia(n1, n2);
					calculoDaRaizCubica(n1, n2);
					break;
				case 6:
					todasAsOperacoes(n1, n2);
					break;
				default:
					System.out.println("Entrada invalida do calculo");
					break;
				}

			}
		}

		catch (InputMismatchException e) {
			throw new Excecao("Tipo errado");
		}

	}
	
	public static void calculoDaSoma(Double a, Double b) {
		double soma = a + b;
		System.out.println("Soma dos numeros: " +  soma);
	}
	
	public static void calculoDaSubtracao(Double a, Double b) {
		double sub = a + b;
		System.out.println("Subtracao dos numeros: " +  sub);
	}
	
	public static void calculoDaDiv(Double a, Double b) {
		double div = a / b;
		System.out.println("Divisao dos numeros: " +  div);
	}
	
	public static void calculoDaMult(Double a, Double b) {
		double mult = a + b;
		System.out.println("Multiplicacao dos numeros: " +  mult);
	}
	
	public static void calculoDaPotencia(Double a, double b) {
		double pot = Math.pow(a, b);
		System.out.println("Potencia dos numeros: " +  pot);
	}
	
	public static void calculoDaRaizQuadrada(Double a, double b) {
		System.out.println("Raiz quadrada do primeiro numero: " + Math.sqrt(a));
		System.out.println("Raiz quadrada do segundo numero: " + Math.sqrt(b));
	}
	
	public static void calculoDaRaizCubica(Double a, double b) {
		System.out.println("Raiz cubica do primeiro numero: " +Math.pow(a, (1.0 / 3.0)));
		System.out.println("Raiz cubica do segundo numero: " + Math.pow(b, (1.0 / 3.0)));
	}
	
	public static void todasAsOperacoes(Double a, Double b) {
		calculoDaSoma(a, b);
		calculoDaSubtracao(a, b);
		calculoDaDiv(a, b);
		calculoDaMult(a, b);
		calculoDaRaizQuadrada(a, b);
		calculoDaRaizCubica(a, b);
	}

}
