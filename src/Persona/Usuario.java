package Persona;

public class Usuario {

	// Atributo
	private String tipoUsuario;
	private String username;
	private String password;

	// Crear un nuevo usuario (constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	} // cierre constructor

	// Recuperar contrasenia (getter)
	public String getPassword() {
		// Si el usuario registrado coincide con el usuario que paso como parametro,
		// entonces obtengo la contraseña
		return password;
	}// cierre getter

	// Cambiar contrasenia (setter)
	public void setPassword(String nuevoPassword) {
		//Si la nueva contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior...
		if(nuevoPassword != "") {
			//...entonces reemplazo la contrasenia anterior
			password = nuevoPassword;
			System.out.println("Contraseña modificada con exito");
		} else {
			System.out.println("Lo siento, no se puede modificar la contraseña");
		}
	} //Cierre setter
	
	
	//Cambiar la contrasenia de un objeto del tipo usuario
	
	//Fatima.setPassword (una donde la contrasenia esté vacia)
	//Fatima.setPassword (una donde la contrasenia no este vacia pero sea igual a a la anterior)
	//Fatima.setPassword (se cumplen las dos condiciones)
	
	
	

} // Cierre class Usuario
