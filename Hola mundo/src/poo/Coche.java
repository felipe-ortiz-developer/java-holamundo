package poo;

public class Coche {
	private int altura;
	private int puertas;
	
	public Coche() {
		altura = 12;
		puertas = 4;
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