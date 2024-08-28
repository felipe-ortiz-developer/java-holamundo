package programa_v7;

import java.awt.Frame;
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
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana fue maximizada");
		}else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana esta en su estado normal");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana se ha minimizado");
		}
	}
}