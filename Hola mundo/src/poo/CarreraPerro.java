package poo;

import java.util.Iterator;

public class CarreraPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 10;
		int altura = 120;
		int peso = 30;
		String color = "Negro/Beige";
		Perro miPerro1 = new Perro(velocidad, altura, peso, color);
		Pitbull miPitbull1 = new Pitbull(velocidad, altura, peso, color, 50, "Argentino");
		
		Perro[] miListaPerros = new Perro[2];
		miListaPerros[0] = miPerro1;
		miListaPerros[1] = miPitbull1;
		
		for (Perro e: miListaPerros) {
			System.out.println("La altura es: "+e.getAltura());
			
		}
	}

}
