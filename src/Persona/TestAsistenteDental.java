package Persona;

public class TestAsistenteDental {
	
	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05-oct-2023", 875.40d);
		
		//Impresion de la informacion de nuestro asistente
		Francisca.mostrarDatosAsistentes();
		
		//El sueldo de Francisco no es de 875.40 es de 87.54
		//Cambio de sueldo
		//Francisca.salario = 87.54d;
		
		//Mostrar solo el sueldo (antes del getter)
		//System.out.println(Francisca.salario);
		
		//Mostrar el sueldo (después del getter)
		System.out.println(Francisca.getSalario());
		
		//Modificar salario con el setter
		Francisca.setSalario(30.00); //Si cumple la condicion
		//imprimir el nuevo salario de Francisca
		System.out.println(Francisca.getSalario());
		
		
	} //Cierre metodo main

} //Cierre clase TestAsisenteDental
