package logica;

import java.util.*;


public class Cancion implements Comparable{
	private String duracion;
	enum Estilo {
		POP("p"),CLASICA("class"),METAL("lml"), INDIE("i");
		private String abreviacion;
		
		private Estilo(String abreviacion) { // Se va a ejecutar el mismo numero de veces que el numero de valores que le das a este enum
			//	System.out.println("Abreviacion: "+abreviacion);
			this.setAbreviacion(abreviacion);
		}
		
		public String getAbreviacion(){
			return this.abreviacion;
		}
		
		public void setAbreviacion(String abreviacion) {
			this.abreviacion = abreviacion;
		}
		
	}
	
	public Cancion(String duracion) {
		this.setDuracion(duracion);
		System.out.println("La duracion es: "+this.duracion);
		
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Escribe un estilo");
		String dato = miScanner.next().toUpperCase();
		
		Estilo actual = Enum.valueOf(Estilo.class, dato); // enum Asignar valor
		System.out.println("Estilo: "+actual);
		System.out.println("Abreviatura: "+actual.getAbreviacion());
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Cancion cancion = (Cancion) o;
		if(cancion.duracion == "1M") {
			return 1;
		}
		if(cancion.duracion == "2M") {
			return -1;
		}
		return 0;
	}
}
