package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Oficina {

	public static void main(String[] args) {
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("Edy", 1400000, 07, 04, 2024);
		misEmpleados[1] = new Empleado("Pepito");
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
	private static int idSiguiente = 1; // Guarda el estado actual para el proximo obj
	private final String nombre; // Variable constante que no cambia
	private int sueldo;
	private Date fechaAlta; // Objeto Date
	
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
	
	public Empleado(String nombre) { // Sobrecarga de constructores
		// this.nombre = nombre; 
		this(nombre, 1500000, 1993, 12, 11); // podemos llamar al otro constructor y pasarle parametros por defecto
		
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
