package org.uem.reviewexercices.ex2;

import java.util.Scanner;

/*
Programa en Java que le pida al usuario la temperatura media del dia en cantidad de grados
centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
Utilizar la clase Scanner y el tipo de variable double.

Imprimir por pantalla “La temperatura de hoy en grados centígrados es” y los grados
centrigrados
Y después imprimir por pantalla “La temperatura de hoy en grados Fahrenheit es” y los grados
Fahrenheit.
 */

public class Cent2Fahr {

	public static void main(String[] args) {
		double tmpC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la temperatura en grados C");
		tmpC = Double.parseDouble(sc.nextLine());
		sc.close();
		System.out.printf("Temperatura en grados farenheit es %sF\n", 32 + (9 * tmpC / 5));
	}

}
