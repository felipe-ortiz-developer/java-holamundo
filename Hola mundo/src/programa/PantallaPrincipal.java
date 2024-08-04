package programa;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PantallaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco extends JFrame {
	public Marco() {
		setVisible(true);
		setLocation(400,200);
		setSize(600,450);
		
		setTitle("Esto es un titulo");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Esto es un texto", 100, 100);
	}
}
