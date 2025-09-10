
package Personalizados;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class Escritorio extends JDesktopPane{
    private BufferedImage img;
    String rutaImagen = "/images/Escritorio.jpg";

    public Escritorio() {        
        try {
            img = ImageIO.read(getClass().getResourceAsStream(rutaImagen));
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    
    //Mostrar imagen en Desktop
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
    
    
}
