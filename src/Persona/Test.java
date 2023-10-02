package Persona;

public class Test {

	//Metodo principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Fatima = new Persona ("Fatima", "Fernandez", (byte) 26, "3322089315", "faitxi.1997@gmail.com");
		
		System.out.println(Fatima);// Imprime el lugar en la memoria Persona.Persona@5b480cf9 -> espacio en memoria 
		Fatima.imprimirInfo(); // Imprime la informacion
		Fatima.saludar(); //Imprime saludo
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista ("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "consultorio 500", "avanzado", "matutino", 500);
		
		System.out.println("*******************************");
		Simi.calcularSalario();
		Simi.imprimirInfoDestista();
		
		
		

	} //Cierre metodo main

} //cierre clase Persona
