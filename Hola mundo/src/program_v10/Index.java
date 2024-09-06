package program_v10;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		
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
	
	class EventoFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Focus gained");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Focus lost");
		}
		
	}
	
	private JTextField miTextField1; 
	private JTextField miTextField2; 
}

