package program_v10;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		Marco miMarco2 = new Marco();
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
		
		miTextField1 = new JTextField();
		miTextField2 = new JTextField();
		
		miTextField1.setBounds(120, 10, 150, 20);
		miTextField2.setBounds(120, 50, 150, 20);
		add(miTextField1);
		add(miTextField2);
		
		EventoFoco miEventoFoco = new EventoFoco();
		miTextField1.addFocusListener(miEventoFoco);
		miTextField2.addFocusListener(miEventoFoco);
	}
	
	class EventoFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Focus gained");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Focus lost");
			
			String texto = miTextField1.getText();
			
			for (int i = 0; i < texto.length(); i++) {
				
				if(texto.charAt(i) == '@') {
					System.out.println("El texto tiene un arroba");
					System.out.println();
				}
			}
		}
		
	}
	
	JTextField miTextField1; 
	JTextField miTextField2;

}

