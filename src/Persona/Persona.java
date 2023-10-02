package Persona;

public class Persona {

	//1. Atributos (info como se mostrara mi objeto cuando se instancie)
	
	String  nombre;
	String 	apellido;
	byte	edad; //Para tener una correcta asignacion de memoria
	String	telefono;
	String	email;
		
	
	//2. Constructor con parametros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono; 
		this.email = email;
	} //Cierre constructor
	
	//3. Metodos (lo que podrá hacer mi objeto
	void imprimirInfo (){ //Funcion vacía, no necesita parametros para funcionar
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);

	} //cierre imprimir info
	
	
	void saludar ( ) {
		System.out.println("Hola, te mando saluditos");
	} //Cierre saludar
	
	
	
	//4. Instancia

} //Cierre POO
