package programa_v2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PantallaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente = JOptionPane.showInputDialog("Ingrese una fuente");
		String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nombreFuente: nombresFuentes) {
			System.out.println(nombreFuente);
			if(nombreFuente.equals(fuente)) {
				System.out.println("Encontro la fuente");
			}else {
//				System.out.println("X");
			}
		}
		
		
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
		
		Font miFont = new Font("Gabriola", Font.BOLD, 26);
		g.setFont(miFont);
		g.setColor(Color.BLUE);
		g.drawString("Esto es un texto", 100, 100);
		
		Font miFont2 = new Font("Yu Gothic", Font.ITALIC, 20);
		g.setFont(miFont2);
		g.setColor(Color.BLACK);
		g.drawString("Hola mundo desde otra fuente", 100, 200);
		
		g.drawRect(50, 50, 300, 300);
		g.drawLine(100, 120, 300, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);
	}
}
