import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zapato zapatoPablo = new Zapato();
		ArrayList<ImageIcon> listaImagenes = new ArrayList<ImageIcon>();
		listaImagenes.add(new ImageIcon("v1.png"));
		zapatoPablo.setLista(listaImagenes);
		
		new Ventana6(zapatoPablo);
		
	}

}
