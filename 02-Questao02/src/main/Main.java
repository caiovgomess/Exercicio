package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exceptions.Excecao;

public class Main {

	public static void main(String[] args) throws Excecao {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite a grandeza de temperatura: \n" + "1: Celsius \n" + "2: Fahrenheit \n" + "3: Kelvin");

		try {
			Integer grandeza = sc.nextInt();

			if (grandeza < 1 || grandeza > 3) {
				System.out.println("Entrada invalida");

			} else {
				System.out.println("Digite o valor da temperatura desejada: ");
				Double temp = sc.nextDouble();
				
				switch (grandeza) {
				case 1:
					converteCelsiusParaOutrasGrandezas(temp);
					break;
				case 2:
					converteFahrenheitParaOutrasGrandezas(temp);
					break;
				case 3:
					converteKelvinParaOutrasGrandezas(temp);
					break;
				default:
					System.out.println("Entrada inv�lida");
				}
			}

		} catch (InputMismatchException e) {
			throw new Excecao("Tipo de variavel digitada eh invalido");
		}

	}
	
	public static void converteCelsiusParaOutrasGrandezas(Double temp) {
		Double convertidoFahrenheit = (temp * (9.0 / 5.0)) + 32.0;
		Double convertidoKelvin = temp + 273.15;
		System.out.println("Temperatura em Fahrenheit: " + convertidoFahrenheit);
		System.out.println("Temperatura em Kelvin: " + convertidoKelvin);

	}

	public static void converteFahrenheitParaOutrasGrandezas(Double temp) {
		Double convertidoCelsius = (temp - 32.0) * (5.0 / 9.0);
		Double convertidoKelvin = (temp - 32.0) * (5.0 / 9.0) + 273.15;
		System.out.println("Temperatura em Celsius: " + convertidoCelsius);
		System.out.println("Temperatura em Kelvin: " + convertidoKelvin);
	}

	public static void converteKelvinParaOutrasGrandezas(Double temp) {
		Double convertidoCelsius = temp - 273.15;
		Double convertidoFahrenheit = (temp - 273.15) * (9.0 / 5.0) + 32.0;
		System.out.println("Temperatura em Celsius: " + convertidoCelsius);
		System.out.println("Temperatura em Fahrenheit: " + convertidoFahrenheit);
	}
}
