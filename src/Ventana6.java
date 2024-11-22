import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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
	
	String imagenVolverAPantallaAnterior = "flecha.png";
	String imagenMeGusta = "corazon.png";
	
	Color naranja = new Color(254, 153, 0);
	Zapato zapato;
	
	public Ventana6(Zapato zapato) {
		this.zapato = zapato;
		setResizable(false);
		setSize(393,852);
		setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();

		add(new botonVolverAPantallaAnterior(constraints), constraints);
		
		add(new ImagenZapatilla(zapato.lista.get(0), constraints), constraints);
		
		add(new JLabelTitulo("Nike Air Presto", constraints), constraints);
		
		add(new BotonMeGusta(constraints), constraints);

		setVisible(true);
		
	}
	
	class botonVolverAPantallaAnterior extends JButton implements ActionListener{
		
		public botonVolverAPantallaAnterior(GridBagConstraints constraints){
			super(imagenReescalada(imagenVolverAPantallaAnterior, 30,30));
			constraints.gridx = 0; // El área de texto empieza en la columna cero.
			constraints.gridy = 0; // El área de texto empieza en la fila cero
			constraints.gridwidth = 4; // El área de texto ocupa dos columnas.
			constraints.gridheight = 1; // El área de texto ocupa 2 filas.
			constraints.weightx = 1;
			constraints.weighty = 1;
			constraints.fill = GridBagConstraints.HORIZONTAL;
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
	
	class JLabelTitulo extends JLabel {
		
		public JLabelTitulo(String nombreZapatilla, GridBagConstraints constraints) {
			super(nombreZapatilla);
			this.setFont(new Font("Arial", Font.BOLD, 18));
			constraints.gridx = 0; // El área de texto empieza en la columna cero.
			constraints.gridy = 6; // El área de texto empieza en la fila cero
			constraints.gridwidth = 3; // El área de texto ocupa dos columnas.
			constraints.gridheight = 1; // El área de texto ocupa 2 filas.
		}
	}
	
	class BotonMeGusta extends JButton{
		
		public BotonMeGusta(GridBagConstraints constraints) {
			super(imagenReescalada(imagenMeGusta, 30, 30));
			constraints.gridx = 3; // El área de texto empieza en la columna cero.
			constraints.gridy = 6; // El área de texto empieza en la fila cero
			constraints.gridwidth = 1; // El área de texto ocupa dos columnas.
			constraints.gridheight = 1; // El área de texto ocupa 2 filas.
			
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
	
	public static ImageIcon imagenReescalada(String nombreImagen, int x, int y) {
		Image img = null;
		
		try {
			img = ImageIO.read(new File(nombreImagen)).getScaledInstance(x, y, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		return new ImageIcon(img);
	}
}
