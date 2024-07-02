package snake2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import snake2.Front.PantallaJuego;
import snake2.Front.PantallaPrincipal;

public class Snake2 implements Runnable, ActionListener{
    private volatile boolean iniciado = true;
    private static Timer timer;
    private PantallaPrincipal pantallaPrincipal;
    private PantallaJuego pantallaJuego;
    private Thread thread;
    private Jugador jugador;
    private Tablero tablero;
    private boolean partidaIniciada;

    public Snake2(){
        pantallaPrincipal = new PantallaPrincipal();
        partidaIniciada = false;
    }
   
    public static void main(String[] args) {
        Snake2 game = new Snake2();
        game.iniciarJuego();
    }
    
    public synchronized void iniciarJuego(){
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void detenerJuego(){
        iniciado = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void iniciarPartida(){
        jugador = new Jugador("Sci", 5, 1, "Derecha", 3);
        tablero = new Tablero(jugador.getPersonaje(), 0);
        pantallaJuego = new PantallaJuego(tablero, jugador);
        partidaIniciada = true;
        timer = new Timer(175, this);
        timer.start();
    }

    public static void setDelay(int delay){
        timer.setDelay(delay);
    }

    @Override
    public void run(){        
        while(iniciado){
            if(pantallaPrincipal.getRespuesta() && !partidaIniciada){
                iniciarPartida();
            }

            //if(pantallaJuego != null && !pantallaJuego.getEnJuego() && !partidaIniciada){
            //    pantallaJuego.setVisible(false);
            //    pantallaPrincipal.setVisible(true);
            //}

        }
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
        if(!tablero.getPausa()){
            jugador.getPersonaje().movimiento();

            if(tablero.personajeSobreComida()){
                jugador.aumentaPuntaje();
                pantallaJuego.actualizaPuntaje(jugador);
            }

            tablero.chocaConPared();
            jugador.getPersonaje().chocaConCuerpo();
            pantallaJuego.actualizaMapa();
            
            if(!jugador.getPersonaje().getEstado()){
                timer.stop();
                //pantallaJuego.setEnJuego(false);
                //partidaIniciada = false;
                //pantallaPrincipal.setRespuesta(false);
            }

            if(tablero.getTiempo() != 0){
                tablero.disminuyeTiempoEspecial();

            }else{
                if(!tablero.hayComidaEspecial()){
                    tablero.generarComidaEspecial();
                    tablero.desactivaRapidez();
                    jugador.getPersonaje().descongelar();
                }
                
                tablero.getComidaEspecial().actualizaTiempo();
                
                if(tablero.getComidaEspecial().getTiempoVisible() == 0){
                    tablero.borraComidaEspecial();
                }
            }
        }
        pantallaJuego.muestraPausa(tablero);
    }
}
