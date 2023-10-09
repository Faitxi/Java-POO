package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	// Metodo principal para instanciar mis clases
	public static void main(String[] args) {

		/*
		 * Instancia de Persona Persona Fatima = new Persona ("Fatima", "Fernandez",
		 * (byte) 26, "3322089315", "faitxi.1997@gmail.com");
		 * 
		 * System.out.println(Fatima);// Imprime el lugar en la memoria
		 * Persona.Persona@5b480cf9 -> espacio en memoria Fatima.imprimirInfo(); //
		 * Imprime la informacion Fatima.saludar(); //Imprime saludo
		 * 
		 * 
		 * //Instancia de Dentista /*Dentista Simi = new Dentista ("Dr. Simi", "Lares",
		 * (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344",
		 * "consultorio 500", "avanzado", "matutino", 500);
		 * 
		 * System.out.println("*******************************");
		 * Simi.calcularSalario(); Simi.imprimirInfoDestista();
		 * 
		 * 
		 * //Instancia de Paciente con todos los datos Paciente Chencho =new
		 * Paciente("CHNCH1234", "RH Positivo", true, true, "05/oct/2023",
		 * "Doc. Simi Lares",false); System.out.println("***************************");
		 * System.out.println(Chencho);
		 * 
		 * 
		 * //Instancia de Paciente con datos obligatorios Paciente Masiosare = new
		 * Paciente("MAS12345", false, false);
		 * System.out.println("*************************");
		 * System.out.println(Masiosare);
		 * 
		 * //Cambiar el false de seguroMedico a true //Masiosare.seguroGastosMedicos =
		 * true; System.out.println("**********************");
		 * System.out.println(Masiosare);
		 */

		// Implementacion de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList = new ArrayList<>();

		// Primero genero una instancia de Dentista
		Dentista DrChapatin = new Dentista("Dr. Chapatin", "Chespirito", (byte) 45, "11223344", "chapatin@gmail.com",
				"General", "66612345", "Consultorio 200", "avanzado", "matutino", 450);

		// Luego la agrego a la lista
		listaDentistasArrayList.add(DrChapatin);

		// Si agrego la instancia a una variable, puedo imprimir su informacion usando
		// un toString, o un metodo mostrarInfo();

		// Hago una instancia y la agrego directamente a la lista
		listaDentistasArrayList.add(new Dentista("Dr. Simi", "Lares", (byte) 50, "12345678", "simi@lares.com",
				"Odontología", "55113344", "consultorio 500", "avanzado", "matutino", 500));

		// Si genero la instancia y la agrego directamente al arrayList, para sacar el
		// dato tendré que utilizar un forEach o algun ciclo para imprimir dato por
		// dato.

		// Implementacion de lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();

		// Agregando Dentista a mi conjunto
		conjuntoDentistas.add(new Dentista("Dr. Simi", "Lares", (byte) 50, "12345678", "simi@lares.com", "Odontología",
				"55113344", "consultorio 500", "avanzado", "matutino", 500));

		// Implementacion de un hashmap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();

		// Agregar un destista a mi mapa
		mapaDentistas.put("Dr. House", new Dentista("Gregory", "House", (byte) 55, "12345678", "house@gmail.com",
				"Cirujano", "55113344", "consultorio 600", "avanzado", "vespertino", 1400));

		// Imprimir el objeto Doctor House
		 Dentista doctorBuscado = mapaDentistas.get("Dr. House");
		 
		 System.out.println(doctorBuscado);
		

		 
		 
	} // Cierre metodo main

} // cierre clase Persona
