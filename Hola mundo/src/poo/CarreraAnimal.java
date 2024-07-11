package poo;

import java.util.Iterator;

public class CarreraAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 10;
		int altura = 120;
		int peso = 30;
		String alturaCaballo = "2mt";
		
		String color = "Negro/Beige";
		Perro miPerro1 = new Perro(velocidad, altura, peso, color);
		Pitbull miPitbull1 = new Pitbull(velocidad, altura, peso, color, 50, "Argentino");
		Caballo miCaballo = new Caballo(alturaCaballo);
		
		Animal[] miListaAnimales = new Animal[3];
		miListaAnimales[0] = miPerro1;
		miListaAnimales[1] = miPitbull1;
		miListaAnimales[2] = miCaballo;
		
		for (Animal e: miListaAnimales) {
			System.out.println("El tipo es: "+e.getTipo());
		}
		
		Pitbull miPitbull2 = (Pitbull) miListaAnimales[1];
		System.out.println("La raza de mi pitbull es "+miPitbull2.getRaza());
	}

}