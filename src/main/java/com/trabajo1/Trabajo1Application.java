package com.trabajo1;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabajo1.Componentes.Depenedencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner{

	Depenedencia depenedencia;
	
	
	public Trabajo1Application(Depenedencia depenedencia) {
		this.depenedencia = depenedencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//suma
		//this.depenedencia.salida_mensaje(this.depenedencia.suma(depenedencia.leer_teclado(), depenedencia.leer_teclado()));
		//resta
		//this.depenedencia.salida_mensaje(this.depenedencia.resta(depenedencia.leer_teclado(), depenedencia.leer_teclado()));
	    //mayor de dos numeros
		//this.depenedencia.salida_mensaje(this.depenedencia.mayor(this.depenedencia.leer_teclado(), this.depenedencia.leer_teclado()));
	    //tabla del array
		ArrayList<String> vector=this.depenedencia.tabla(this.depenedencia.leer_teclado());
	  for(String valor:vector) {
		  depenedencia.salida_mensaje(valor);
		  
	  }
	}

}
