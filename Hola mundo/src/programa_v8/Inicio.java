package programa_v8;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//import programa_v8.ListenerCambiaEstado;
//import programa_v8.Ventana;

public class Inicio {
	public static void main(String[] args) {
		Ventana miVentana = new Ventana(); 
	}
}
class Ventana extends JFrame {
	public Ventana() {
		setVisible(true);
		setBounds(700, 300, 500, 300);
		
		EventoDeTeclado miEventoTeclado = new EventoDeTeclado();
		addKeyListener(miEventoTeclado);
	}
}

class EventoDeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyChar = e.getKeyChar();
		System.out.println(keyChar);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		System.out.println(keyCode);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}