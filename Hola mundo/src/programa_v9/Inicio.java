package programa_v9;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana miVentana = new Ventana();
		
	}
}

class Ventana extends JFrame {
	public Ventana() {
		setVisible(true);
		setBounds(700, 300, 500, 300);
		
		EventosDeRaton eventoDeRaton = new EventosDeRaton();
		addMouseListener(eventoDeRaton);
	}
}

class EventosDeRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}
	
}