package programa_v11;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class Inicio extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inicio miInicio = new Inicio();
		miInicio.iniciar();
	}
	
	public void iniciar() {
		Inicio miMarco1 = new Inicio();
		Inicio miMarco2 = new Inicio();
		
		miMarco1.setVisible(true);
		miMarco2.setVisible(true);
		
		miMarco1.setBounds(300, 100, 600, 350);
		miMarco2.setBounds(300, 200, 600, 350);
		
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco1.addWindowFocusListener(this);
		miMarco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowGainedFocus");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowLostFocus");
	}

}
