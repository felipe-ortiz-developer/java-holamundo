package poo;

import javax.swing.JOptionPane;

public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche();
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una altura")); 
		coche1.setAltura(altura);
		System.out.println(coche1.getAltura());
	}

}
