package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carrera {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		// String altura = JOptionPane.showInputDialog("Ingrese una altura");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la altura del coche");
		int altura = Integer.parseInt(entrada.nextLine());
		coche1.setAltura(altura);
		System.out.println(coche1.getAltura());
		
		Furgoneta furgoneta1 = new Furgoneta(200, 2);
		System.out.println(furgoneta1.getPuertas());
	}

}
