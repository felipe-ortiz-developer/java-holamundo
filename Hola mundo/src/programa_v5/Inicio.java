package programa_v5;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inicio {
	public static void main(String[] args) {
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Marco miMarco2 = new Marco();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		M_ventana miAccionVentana = new M_ventana();
		addWindowListener(miAccionVentana);
	}
}

class Lamina extends JPanel {
	private Image miImagen;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		File miFile = new File("src/graficos/avatar.jpeg");
		try {
			miImagen = ImageIO.read(miFile);
		} catch(IOException e) {
			System.out.println("No se pudo leer la imagen");
		}
		
		g.drawImage(miImagen, 5,5,null);
		
		int altura = miImagen.getHeight(this);
		int anchura = miImagen.getWidth(this);
		
		for (int i = 0; i < 300; i++) {
			for (int j = 0; j < 200; j++) {
				if(i+j>0) {
					g.copyArea(5, 5,anchura , altura, anchura*i, altura*j);
				}
			}	
		}
	}
}

class M_ventana implements WindowListener {
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activa");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana restaurada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desactivada");
	}
}