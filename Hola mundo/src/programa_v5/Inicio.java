package programa_v5;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inicio {
	public static void main(String[] args) {
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		g.copyArea(5, 5, 100, 100, 200, 100);
	}
}