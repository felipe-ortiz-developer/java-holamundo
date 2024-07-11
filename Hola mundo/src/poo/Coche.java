package poo;
import java.util.*;

public class Coche {
	private int altura;
	private int puertas;
	enum Version { // enum Declarar
		BASICO("B"), SEMI("S"), FULL("F");
		private String abreviatura;
		
		private Version(String abreviatura) {
			this.setAbreviatura(abreviatura);
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		public void setAbreviatura(String abreviatura) {
			this.abreviatura = abreviatura;
		}
	}; 
	
	public Coche() {
		altura = 12;
		puertas = 4;
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Escribe una version");
		String dato = miScanner.next().toUpperCase();
		
		Version actual = Enum.valueOf(Version.class, dato); // enum Asignar valor
		System.out.println("Version: "+actual);
		System.out.println("Abreviatura: "+actual.getAbreviatura());
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura =  altura;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	} 
}