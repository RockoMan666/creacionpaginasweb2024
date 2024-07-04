import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelConFondo extends JPanel
{
    ImagenDeFondo objImagen = new ImagenDeFondo(this);
    
    
    @Override
    public void paintComponent(Graphics obj_graf) {         //Sobreescribimos  el metodo de paintComponent
        super.paintComponent(obj_graf);                     //pintar el componente
        Graphics2D obj_graf_2D = (Graphics2D) obj_graf;     //convertimos al tipo Graphics2D el objeto g para poder enviarlo al metodo dibujar()

        dibujar(obj_graf_2D);                               //invocamos el metodo dibujar enviandole el componente g2 convertido anteriormente
//        dibujarPuntaje(g2);                               //invocamos el metodo dibujar enviandole el componente g2 convertido anteriormente
    }

    public void dibujar(Graphics2D g) {
        objImagen.dibujalo(g);
    }
    
}
