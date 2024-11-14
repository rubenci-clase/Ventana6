import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana6 extends JFrame{
	Color naranja = new Color(254, 153, 0);
	Zapato zapato;

	public Ventana6(Zapato zapato) {
		this.zapato = zapato;
		setResizable(false);
		setSize(393,852);
		setLayout(new BorderLayout());
		
		add(new PanelBotonSuperiorSalir(), BorderLayout.NORTH);
		add(new PanelFoto(), BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
	class PanelBotonSuperiorSalir extends JPanel implements ActionListener{
		
		public PanelBotonSuperiorSalir(){
			setLayout(new FlowLayout(FlowLayout.LEFT));
			Image img = null;
			try {
				img = ImageIO.read(new File("flecha.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			
			JButton botonVolverAPantallaAnterior = new JButton(new ImageIcon(img));
			botonVolverAPantallaAnterior.setBackground(Color.WHITE);
			botonVolverAPantallaAnterior.addActionListener(this);
			
			add(botonVolverAPantallaAnterior);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class PanelFoto extends JPanel{
		
		Image imagenRedimensionada;
		
		public PanelFoto() {
			imagenRedimensionada = zapato.getLista().get(0).getImage();
			imagenRedimensionada.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

		}
		
		public void paintComponent(Graphics g) {
			g.drawImage(imagenRedimensionada, 0, 0, 393, 393, 0, 0, 393, 393, null);
		}
		
		
	}
	
	public class AdaptadorDeIconImage {

		public static Icon convertirEnIcon(ImageIcon imagenEntrada) {
			
			return (Icon)imagenEntrada;
		}
		
		public static Image convertirEnImage(ImageIcon imagenEntrada) {
			
			return imagenEntrada.getImage();
		}
	}
}
