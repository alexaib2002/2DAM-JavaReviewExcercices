package org.uem.reviewexercices.ex2;

import java.util.Scanner;

/*
Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
pantalla la longitud y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio,
Area de la circunferencia = PI*Radio^2
 */

public class CircleCalculations {
	static final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de la circunferencia");
		double circRadio = Double.parseDouble(sc.nextLine());
		sc.close();
		System.out.printf("Longitud = %s\nArea = %s", 2*PI*circRadio, PI*circRadio*circRadio);
	}

}
