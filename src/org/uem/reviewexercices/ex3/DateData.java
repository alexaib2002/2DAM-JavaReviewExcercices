package org.uem.reviewexercices.ex3;

import java.util.Scanner;

class DateData {

    /*
    Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30
    días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se debe comprobar que el valor
    introducido esté comprendido entre 1 y 12.
    Después de obtener la variable entera el programa debe imprimir por pantalla el número de
    dias del mes correspondiente y se mostrará además el nombre del mes. P.e si el usuario
    introduce 5 se imprimirá por pantalla 31 y el nombre del mes mayo.
     */
	
	private static final String[] MONTHS = {
			"Enero", "Febrero", "Marzo", "Abril",
			"Mayo", "Junio", "Julio", "Agosto", 
			"Septiembre", "Octubre", "Noviembre", "Diciembre"
	};
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero del mes");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca el año");
        int year = Integer.parseInt(sc.nextLine());
        sc.close();
        if (month < 1 || month > 12) {
        	System.err.println("El mes introducido no es válido");
        	return;
        }
        int numDays = 0;
        boolean leapYear = false;

        if (((year % 4 == 0) && 
                        !(year % 100 == 0))
                        || (year % 400 == 0)) {
        	System.out.println("El año es bisiesto");
        	leapYear = true;
        } else {
        	System.out.println("El año no es bisiesto");
        }
        
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                numDays = leapYear ? 29 : 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.printf(
        		"Numero de dias del mes %s: %s\n",
        		MONTHS[month - 1],
        		numDays);
    
    }
}