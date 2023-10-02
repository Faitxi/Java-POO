package Persona;

public class Dentista extends Persona {

	// 1. Atributos
	/*
	 * Ya no creo valores como nombre, edad, etc., porque estos valores los voy a
	 * heredar de la clase Persona
	 */
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;

	// 2. Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //Informacion de la clase persona
		//Informacion de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}// Cierre constructor Dentista heredando atributos de clase Persona

	//3.Metodos (Metodo para calcular salario basado en la experiencia 
	//Experiencia = basico, intermedio, avanzado
	//Si el dentista está en el rango basico, gana 30,000. Si en intermedio gana 40.000. Si es avanzado gana 50,000
	
	void calcularSalario () {
		//Logica de programacion
		if(experiencia.equals("basico")) { // cuando utilizo el metodo .equals evaluo el cotenido de experiencia y que sea igual al contenido de la variable experiencia
			//cuando utilizo operador de igualdad evaluo experiencia = experiencia (referencia de mi variable
			salario = 30000;
		} else if (experiencia.equals("intermedio")) { 
			salario = 40000;
		} else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
			
	} //Cierre calcular salario
	
	
	
	void imprimirInfoDestista() {
		System.out.println("La especialidad es igual a: " + especialidad);
		System.out.println("El salario es: " + salario);
	} //cierre imprimirInfoDentista
	
	
}// Cierre dentista

