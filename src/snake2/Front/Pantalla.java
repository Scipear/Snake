package snake2.Front;
import javax.swing.JFrame;
/**
* Clase parte del GUI. Esta clase padre es la que se encarga de mostrar las ventanas del programa,
* de ella heredan los diferentes tipos de ventanas que habra en el juego, como por ejemplo
* la ventada de inicio, la ventada del lobby, la ventada de la partida
* 
* @version 1.0
*
*/
public class Pantalla extends JFrame {
    protected static final int ancho = 700;
    protected static final int alto = 700; /* Tamanio fijo que tendra cada ventana, esto podria ajustarse
    en un futuro, en caso que en la resolucion de las pantallas del laboratorio o alguna computadora no
    entre completa o se vea muy pequeña, hay que ir haciendo pruebas*/

    /**
     * Constructor de la clase
     * 
     */
    public Pantalla(){
        setTitle("Snake");
        setSize(ancho, alto);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
