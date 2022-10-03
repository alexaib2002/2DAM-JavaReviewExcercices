package org.uem.reviewexercices.ex1;

import java.util.Scanner;

/*
 * 2. Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra 
un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el 
condicional if y el println para resolverlo. 
 */

public class PosOrNeg {

	public static void main(String[] args) {
		int b;
		System.out.println("Introduce el valor de b");
		Scanner sc = new Scanner(System.in);
		b = Integer.parseInt(sc.nextLine());
		sc.close();
		if (b < 0) {
			System.out.println("B es negativo");
			return;
		}
		System.out.println("B es positivo");

	}

}
