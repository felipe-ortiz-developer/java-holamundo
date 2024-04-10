package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Oficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado miEmpleado1 = new Empleado("Felipe", 1400000, 07, 04, 2024);
		Empleado miEmpleado2 = new Empleado("Daenerys", 4700000, 10, 04, 2024);
		miEmpleado1.aumentarSueldo();
//		miEmpleado.sueldo;
		
		System.out.println("El sueldo subio a " + miEmpleado1.getSueldo());
		System.out.println("La fecha es: "+ miEmpleado1.getFechaAlta());
		
//		miEmpleado.setNombre("algo"); // Da error por que nombre es constante (final)
		System.out.println("El nombre es: "+miEmpleado1.getNombre());
		
		System.out.println("El id del empleado 1: "+miEmpleado1.getId());
		System.out.println("El id del empleado 2: "+miEmpleado2.getId());
	}

}

class Empleado {
	private int id;
	private static int idSiguiente = 1;
	private final String nombre;
	private int sueldo;
	private Date fechaAlta;
	
	public Empleado(String nombre, 
			int sueldo,
			int anio,
			int mes,
			int dia) {
		this.id = this.idSiguiente;
		this.idSiguiente++;
		this.nombre = nombre;
		this.sueldo = sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia); 
		this.fechaAlta = calendario.getTime();
	}
	
	public void aumentarSueldo(){
		this.sueldo = this.sueldo*5;
	}
	
	public int getSueldo() {
		return this.sueldo;
	}
	
	public Date getFechaAlta() {
		return this.fechaAlta;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	
	public int getId() {
		return this.id;
	}
}
