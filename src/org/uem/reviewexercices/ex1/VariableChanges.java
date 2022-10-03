package org.uem.reviewexercices.ex1;

/*
 * 1.Programa  java  que  declare  cuatro  variables  enteras  A,  B,  C  y  D  y  asígnale  un  valor  acada  una.  A 
continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A 
tome el valor de D, D tome el valor de B.. Imprimir por pantalla los valores iniciales y posteriormente los 
valores finales con dos líneas de separación
 */

public class VariableChanges {
	public static void main(String[] args) {
		int a, b, c, d, tmp;
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		tmp = b;
		b = c;
		c = d;
		d = a;
		a = tmp;
		System.out.printf("a: %s b: %s c: %s d: %s", a, b, c ,d);
	}
}