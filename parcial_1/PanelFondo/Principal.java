import java.awt.Color;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana_principal = new JFrame("Mi ventana de tipo JFrame");   //<-- instanciando JFrame con Titulo
        
        PanelConFondo panel_del_juego_666 = new PanelConFondo();  //<--instanciando el objeto panel_del_juego (q es un JPanel)
        ventana_principal.add(panel_del_juego_666);                     //<--agregando ese JPanel al JFrame
        
        //panel_del_juego_666.setBackground(Color.red);
        
	ventana_principal.setSize(728,410);
        ventana_principal.setLocationRelativeTo(null);
        ventana_principal.setVisible(true);
        ventana_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel_del_juego_666.repaint();
    }    
}