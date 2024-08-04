package programa;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home extends JFrame {
	public Home() {
//		
		Marco miMarco = new Marco();
		miMarco.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco  extends JFrame {
	public Marco() {
//		setLocation(500, 200);
//		setSize(300,300);
//		setBounds(500, 200, 300, 300);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setSize
//		setResizable(false);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
//		setTitle("Mi ventana");
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension midimension = mipantalla.getScreenSize();
//		int ancho = midimension.width;
//		int alto = midimension.height;
//		setSize(ancho/2, alto/2);
//		setLocation(ancho/4, alto/4);
		setLocation(400, 200);
		setSize(600, 450);
		
		Image miIcono = mipantalla.getImage("src/graficos/180862.PNG");
		setIconImage(miIcono);
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Esto es un texto", 100, 100);
	}
}
