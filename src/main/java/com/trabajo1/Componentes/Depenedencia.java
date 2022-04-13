package com.trabajo1.Componentes;

import java.util.ArrayList;

public interface Depenedencia {
	void salida_mensaje(String mensaje);
	int leer_teclado();
	String suma(int a, int b);
	String resta(int a, int b);
	String multiplicacion(int a, int b);
	String divicion(int a, int b);
	String mayor(int a, int b);
	ArrayList<String>tabla(int tabladel);
}
