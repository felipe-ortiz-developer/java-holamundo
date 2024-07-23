package poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pitbull extends Perro implements Mecanico {
	private int fuerza;
	private String raza;
	private int imc;
	
	public Pitbull(int velocidad, int altura, int peso, String color, int fuerza, String raza, String motor) {
		super(velocidad, altura, peso, color);
		this.setFuerza(fuerza);
		this.setRaza(raza);
		this.imc = this.calcularIMC();
		System.out.println("Acción: "+this.accion);
		System.out.println(this.motor(motor));
		System.out.println("Velocidad de movimiento: "+this.velocidadMovimiento(velocidad));
		
	}
	
	private int calcularIMC() { // metodo private
		int altura = this.getAltura();
		int calculo = altura * 2;
		return calculo;  
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
//	public int getAltura() {
//		return 100;
//	}
	
	public String getTipo() {
		return "Pitbull Lento terrestre";
	}

	@Override
	public String motor(String motor) {
		return motor;
	}

	@Override
	public double velocidadMovimiento(double velocidad) {
		return velocidad*2;
	}
	
	private class TrajeVelocidad implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("La fuerza es : "+fuerza);
		}
		
	}
}