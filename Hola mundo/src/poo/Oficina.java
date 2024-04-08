package poo;
import java.util.Date;

public class Oficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado miEmpleado = new Empleado("Felipe", 1400000, 07, 04, 2024);
		miEmpleado.aumentarSueldo();
//		miEmpleado.sueldo;
		
		System.out.println("El sueldo subio a " + miEmpleado.getSueldo());
	}

}

class Empleado {
	private String nombre;
	private int sueldo;
	private Date fechaAlta;
	
	public Empleado(String nombre, 
			int sueldo,
			int anio,
			int mes,
			int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		
	}
	
	public void aumentarSueldo(){
		this.sueldo = this.sueldo*5;
	}
	
	public int getSueldo() {
		return this.sueldo;
	}
}
