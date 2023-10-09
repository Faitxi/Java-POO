package Persona;

public class AsistenteDental {

	//1. Atributos privados
	 private String fechaIngreso;
	 private double salario;

	
	//2. Constructor publico (dejo el constructor publico, para poder acceder a el de forma sencilla)
	// Generalmente, el constructor siempre va en publico para evitar errores al momento de la instancia
		public AsistenteDental(String fechaIngreso, double salario) {
			this.fechaIngreso = fechaIngreso;
			this.salario = salario;
		} //Cierre de constructor
	 
	
	//3. Metodos
	//Crear un metodo para imprimir informacion
		public void mostrarDatosAsistentes() {
			System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
			System.out.println("El salario del asistente es: " + salario);
		} //Cierre metodo imprimir informacion
		
		
	//Crear Getters y Setters para poder acceder a mis datos privados y poder realizar operaciones con ellos.
	//Sin getters, la informacion me aparece en null.
	//Sin setters, no puedo cambiar la informacion
		
		//Este getter permite retornar el dato de la fecha de ingreso en formato String
		public String  getFechaIngreso() { //poner siempre el get al pincipio para que Java lo detecte como getter
			return fechaIngreso;
		}//Cierre getter
	
		
		//getter para salario
		public double getSalario() {
			return salario;
		} //Cierre getSalario
		
		//Setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if(nuevoSalario > 0 && nuevoSalario < 100) {
				salario = nuevoSalario;
			} //cierre if
		} //cierre setter
	
} //Cierre AsistenteDental
