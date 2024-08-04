package programa_v3;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
 class Marco extends JFrame {
	 public Marco() {
		 setVisible(true);
		 setTitle("Mi aplicación");
		 setLocation(100, 100);
		 setSize(400, 400);
		 
		 Lamina miLamina = new Lamina();
		 add(miLamina);
	 }
 }
 
 class Lamina extends JPanel {
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 Graphics2D g2 = (Graphics2D) g;
		 Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		 g2.setPaint(Color.MAGENTA);
		 g2.fill(rectangulo);
		 g2.setPaint(Color.BLACK);
		 g2.draw(rectangulo);
		 Ellipse2D miEllipse = new Ellipse2D.Double();
		 miEllipse.setFrame(rectangulo);
		 g2.setPaint(Color.blue);
		 g2.draw(miEllipse);
		 
		 g2.setPaint(Color.RED);
		 g2.draw(new Line2D.Double(100, 100, 300, 250));
		 
		 double CentroEnX = rectangulo.getCenterX();
		 double CentroEnY = rectangulo.getCenterY();
		 double radio = 150;
		 Ellipse2D circulo = new Ellipse2D.Double();
		 circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);
		 g2.setPaint(Color.CYAN.darker());
		 g2.draw(circulo);
	 }
 }