package Persona;

public class Paciente {

	// 1. Atributos
	String numSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;

	// 2. Constructor que recopile todos los datos
	Paciente(String numSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos, String cita,
			String doctorAsignado, boolean alergias) {
		this.numSeguroSocial = numSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}// Cierre constructor con todos los campos

	// 2.1 Constructor que recopile solo los datos requeridos u obligatorios
	Paciente(String numSeguroSocial, boolean expediente, boolean seguroGastosMedicos) {
		this.numSeguroSocial = numSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	}// Cierre constructor con campos obligatorios

	// 3. Metodos
	@Override

	// Metodo llamada toString, que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numSeguroSocial=" + numSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	} //Cierre toString

	
	
	//getter
	public boolean getisSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}
	//setter
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	

} // class Paciente
