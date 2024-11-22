import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	JButton botonVolverAPantallaAnterior;
	
	public Ventana6(Zapato zapato) {
		this.zapato = zapato;
		setResizable(false);
		setSize(393,852);
		setLayout(new GridBagLayout());
		
		
		Image img = null;
		try {
			img = ImageIO.read(new File("flecha.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		botonVolverAPantallaAnterior = new JButton(new ImageIcon(img));
		botonVolverAPantallaAnterior.setBackground(Color.WHITE);
		add(botonVolverAPantallaAnterior);
		
		GridBagConstraints constraints = new GridBagConstraints();

		add(new botonVolverAPantallaAnterior(constraints), constraints);
		
		add(new ImagenZapatilla(zapato.lista.get(0), constraints), constraints);

		setVisible(true);
		
	}
	
	class botonVolverAPantallaAnterior extends JButton implements ActionListener{
		
		public botonVolverAPantallaAnterior(GridBagConstraints constraints){
			constraints.gridx = 0; // El área de texto empieza en la columna cero.
			constraints.gridy = 0; // El área de texto empieza en la fila cero
			constraints.gridwidth = 1; // El área de texto ocupa dos columnas.
			constraints.gridheight = 1; // El área de texto ocupa 2 filas.
			
			Image img = null;
			
			try {
				img = ImageIO.read(new File("flecha.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class ImagenZapatilla extends JLabel{
		
		public ImagenZapatilla(ImageIcon img, GridBagConstraints constraints) {
			super(CambiarTamaño(img));
			
			constraints.gridx = 0; // El área de texto empieza en la columna cero.
			constraints.gridy = 1; // El área de texto empieza en la fila cero
			constraints.gridwidth = 4; // El área de texto ocupa dos columnas.
			constraints.gridheight = 4; // El área de texto ocupa 2 filas.

		}
		
		public static ImageIcon CambiarTamaño(ImageIcon img) {
			Image imagenReescalada = img.getImage().getScaledInstance(393, 300, Image.SCALE_SMOOTH);
			
			return new ImageIcon(imagenReescalada);
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
