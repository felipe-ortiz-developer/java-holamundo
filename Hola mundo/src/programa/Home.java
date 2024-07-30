package programa;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Home extends JFrame {
	public Home() {
//		setLocation(500, 200);
//		setSize(300,300);
//		setBounds(500, 200, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setSize
//		setResizable(false);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
//		setTitle("Mi ventana");
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension midimension = mipantalla.getScreenSize();
		int ancho = midimension.width;
		int alto = midimension.height;
		setSize(ancho/2, alto/2);
		setLocation(ancho/4, alto/4);
		Image miIcono = mipantalla.getImage("180862.PNG");
		setIconImage(miIcono);
		
		
	}
}
