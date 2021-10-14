package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class HojaSprites {
    private final int ancho;
    private final int alto;
    public final int[] pixeles;
    
    public HojaSprites(final String ruta, final int ancho, final int alto){
        
            this.alto = alto;
            this.ancho = ancho;
            
            pixeles = new int[ancho * alto];
            
        try {
            
            BufferedImage imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0,0, ancho, alto, pixeles,0, ancho);
            
        } catch (IOException ex) {
            Logger.getLogger(HojaSprites.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public int getAncho() {
        return ancho;
    }
    
    
    
}
