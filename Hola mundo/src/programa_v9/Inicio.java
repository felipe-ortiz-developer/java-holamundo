package programa_v9;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		EventosDeRatonMotion eventosDeRatonMotion = new EventosDeRatonMotion();
		addMouseMotionListener(eventosDeRatonMotion);
	}
}

class EventosDeRatonMotion implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}
	
}

class EventosDeRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		System.out.println("Eje X: " + e.getX() + " / Eje Y: "+e.getY());
		System.out.println("Count click: "+ e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		System.out.println("El valor del click: "+e.getModifiersEx());
		if ( e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK ) { // 1024
			System.out.println("Has pulsado el boton izquierdo del mouse");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado el boton de la rueda");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho del mouse");
		}
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