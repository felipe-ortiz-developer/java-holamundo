package events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
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
		setTitle("Botones y eventos");
//		setLocation(400,200);
//		setSize(600,450);
		setBounds(700, 300, 500, 300);
		
		setTitle("Esto es un titulo");
//		Lamina miLamina = new Lamina();
//		add(miLamina);
		
		LaminaBotones miLaminaBotones = new LaminaBotones();
		add(miLaminaBotones);
	}
}

class Lamina extends JPanel {
	private Image miImagen;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
	}
}

class LaminaBotones extends JButton implements ActionListener {
	JButton miJButtonAzul = new JButton("Azul");
	JButton miJButtonRojo = new JButton("Rojo");
	JButton miJButtonAmarillo = new JButton("Amarillo");
	
	public LaminaBotones() {
		add(miJButtonAzul);
		add(miJButtonRojo);
		add(miJButtonAmarillo);
		miJButtonAzul.addActionListener(this);
		miJButtonRojo.addActionListener(this);
		miJButtonAmarillo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado = e.getSource();
		if(botonPulsado == miJButtonAzul) {
			setBackground(Color.blue);	
		} else if (botonPulsado == miJButtonRojo) {
			setBackground(Color.red);	
		} else if (botonPulsado == miJButtonAmarillo) {
			setBackground(Color.yellow);
		}
	}
}