package com.trabajo1.Componentes;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implementacion implements Depenedencia {

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println("La respuesta es:");
		System.out.println(mensaje);
	}

	@Override
	public int leer_teclado() {
		System.out.println("Ingrese un valor:");
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		System.out.println("SUMA:");
		int suma =a+b;
		return String.valueOf(suma);
	}

	@Override
	public String resta(int a, int b) {
		System.out.println("RESTA:");
		int resta =a-b;
		return String.valueOf(resta);
	}

	@Override
	public String multiplicacion(int a, int b) {
		int multiplicacion =a*b;
		return String.valueOf(multiplicacion);
	}

	@Override
	public String divicion(int a, int b) {
		int divicion =a/b;
		return String.valueOf(divicion);
	}

	@Override
	public String mayor(int a, int b) {
		if(a>b) {
			return("A es mayor que B");
		}else
		{
		return ("B es mayor que A");
		}
	}

	@Override
	public ArrayList<String> tabla(int tabladel) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i=0; i<10; i++) {
		lista.add(String.valueOf(i*tabladel));	
			
		}
		return lista;
	}

}
