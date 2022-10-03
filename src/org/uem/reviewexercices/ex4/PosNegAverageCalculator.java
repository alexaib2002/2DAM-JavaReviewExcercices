package org.uem.reviewexercices.ex4;

import java.util.Scanner;

public class PosNegAverageCalculator {

	/*
	Se quiere realizar un programa en Java que sirva para calcular la media de una serie de valores
	numéricos  que  se  leen  por  teclado.Para  ello  se  quiere  que  el  programa  pida  al  usuario  por
	teclado 10 números enteros, tanto positivos como negativos pero no decimales y los guarde en
	un array.
	A  continuación  calcula  y  muestra  por  separado  la  media  de  los  valores  positivos  y  la  de  los
	valores negativos de los valores numéricos que se le han pedido al usuario y se han guardado en
	un array.
	 */

	public static void main(String[] args) {
		int[] avgNums = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < avgNums.length; i++) {
			System.out.printf("Introduzca el numero de la posicion %s:\n", i);
			avgNums[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		int posNumSum = 0;
		int posNum = 0;
		int negNumSum = 0;
		int negNum = 0;
		for (int i : avgNums) {
			if (i == 0) continue;
			if (i > 0) {
				posNumSum += i;
				posNum++;
				continue;
			}
			negNumSum += i;
			negNum++;
		}
		System.out.printf("La media de los numeros introducidos es:\n"
				+ "    Numeros positivos: %s\n"
				+ "    Numeros negativos: %s\n",
				posNumSum / posNum, negNumSum / negNum);
	}
}
