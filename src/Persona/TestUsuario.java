package Persona;

public class TestUsuario {


	public static void main(String[] args) {
		
		//Instancia de usuario
		
		Usuario Fatima = new Usuario ("Doctora", "DraFatima", "paracetamol");
		
		//cambiar la contraseña
		Fatima.setPassword(""); //Error
		Fatima.setPassword("paracetamol");
		Fatima.setPassword("fatima..diente");
		
		
	}

}
