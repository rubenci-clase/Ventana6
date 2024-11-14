import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AdaptadorDeIconImage {

	public static Icon convertirEnIcon(ImageIcon imagenEntrada) {
		
		return (Icon)imagenEntrada;
	}
	
	public static Image convertirEnImage(ImageIcon imagenEntrada) {
		
		return imagenEntrada.getImage();
	}
}
