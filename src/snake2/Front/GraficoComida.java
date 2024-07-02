package snake2.Front;

import java.awt.Image;
import javax.swing.ImageIcon;
/**
 * Clase parte del front. Se encarga de almacenar todas las imagenes relacionadas a la comida del juego
 * 
 * @version 1.1
 */
public class GraficoComida extends Grafico{
    private Image comidaRegular;
    private Image comidaDoble;
    private Image comidaPicante;
    private Image comidaCongelada;
    private Image comidaRocosa;

    public GraficoComida(){
        comidaRegular = ajustarImagen(new ImageIcon("ComidaRegular.png").getImage());
        comidaDoble = ajustarImagen(new ImageIcon("ComidaDoble.png").getImage());
        comidaPicante = ajustarImagen(new ImageIcon("ComidaPicante.png").getImage());
        comidaCongelada = ajustarImagen(new ImageIcon("ComidaCongelada.png").getImage());
        comidaRocosa = ajustarImagen(new ImageIcon("ComidaRocosa.png").getImage());
    }

    public Image getComidaRegular(){
        return comidaRegular;
    }

    public Image getComidaDoble(){
        return comidaDoble;
    }

    public Image getComidaPicante(){
        return comidaPicante;
    }

    public Image getComidaCongelada(){
        return comidaCongelada;
    }

    public Image getComidaRocosa(){
        return comidaRocosa;
    }
}
