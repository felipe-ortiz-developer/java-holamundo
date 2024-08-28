package programa_v7;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

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
		
		ListenerCambiaEstado miListenerCambiaEstado = new ListenerCambiaEstado();
		addWindowStateListener(miListenerCambiaEstado);
	}
}

class ListenerCambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e){
		System.out.println("La ventana ha cambiado de estado");
	}
}