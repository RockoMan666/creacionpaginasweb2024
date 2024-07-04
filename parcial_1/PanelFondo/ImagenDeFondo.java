
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class ImagenDeFondo {

        private PanelConFondo objPanelImagen;
    
	public ImagenDeFondo (PanelConFondo objPanelImagen) {  //Constructor
		this.objPanelImagen= objPanelImagen;
	}

       
        
        public void dibujalo(Graphics2D obj_grafico) {
            ImageIcon obj_imagen_de_Fondo =new ImageIcon(getClass().getResource("fondo_mb.jpg"));
            obj_grafico.drawImage(obj_imagen_de_Fondo.getImage(), 0, 0,728,410,null);
            //obj_grafico.drawImage(obj_imagen_de_Fondo.getImage(), x_img2, y_img2,ancho_fondo,alto_fondo,null);
        }

}
