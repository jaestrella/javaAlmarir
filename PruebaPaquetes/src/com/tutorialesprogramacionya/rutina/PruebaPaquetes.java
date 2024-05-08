package com.tutorialesprogramacionya.rutina;

import com.tutorialesprogramacionya.calculadora.Cadena;
import com.tutorialesprogramacionya.calculadora.Matematica;

public class PruebaPaquetes {

	public static void main(String[] args) {
		int n1=10;
		int n2=10;
		String cadena="hola mundo";
		
		System.out.println(Matematica.sumar(n1, n2));
		System.out.println(Cadena.mayuscula(cadena));

	}

}
