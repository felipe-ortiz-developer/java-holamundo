package poo;

public class Perro extends Animal {
	private int patas;
	private int velocidad;
	private int altura;
	private int peso;
	private String color;
	
	public Perro(int velocidad, int altura, int peso, String color ) {
		super();
		this.setPatas(4);
		this.velocidad = velocidad;
		this.altura = altura;
		this.peso = peso;
		this.color = color;
	}
	
	public String getTipo() {
		return "Perro medio terrestre";
	}
	
	public int getVelocidad(){
		return this.velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public final int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
