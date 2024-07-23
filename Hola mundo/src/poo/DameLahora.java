package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLahora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date ahora = new Date();
		System.out.println("Hora: "+ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}
