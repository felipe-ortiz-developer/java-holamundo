package poo;

public class Coche {
	private int altura;
	private int puertas;
	
	public Coche() {
		altura = 12;
		puertas = 4;
	}
	
	public void setAltura(int inputAltura) {
		altura =  inputAltura;
	}
	
	public int getAltura() {
		return altura;
	}
}