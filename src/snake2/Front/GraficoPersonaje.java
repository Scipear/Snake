package snake2.Front;

import java.awt.Image;
import javax.swing.ImageIcon;
import snake2.Personaje;

/**
 * Clase parte del GUI. Esta clase se encarga de mantener las imagenes correspondientes de un personaje
 * 
 * @version 1.0.2
 */
public class GraficoPersonaje extends Grafico{
    private Image cabeza[]; /*Arreglo que guarda la imagen de cada direccion a la que puede mirar la cabeza
    de la serpiente*/
    private Image cuerpo[];/*Arreglo que guarda la imagen de cada direccion a la que puede mirar el cuerpo
    de la serpiente*/
    private Image cola[];/*Arreglo que guarda la imagen de cada direccion a la que puede mirar la cola
    de la serpiente*/
    /*Cada posicion de estos arreglos guarda una imagen de una respectiva direccion
    posicion 0: arriba, posicion 1: derecha, posicion 2: abajo, posicion 3: izquierda */
    private Image curva[];/*Arreglo que guarda la imagen cada tipo de curva o doblez de la serpiente
    posicion 0: Cuando la serpiente va de derecha para abajo o de arriba para la izquierda
    posicion 1: Cuando la serpiente va de derecha para arriba o de abajo para la izquierda
    posicion 2: Cuando la serpiente va de izquierda para abajo o de arriba para la derecha
    posicion 3: Cuando la serpiente va de izquierda para arriba o de abajo para la derecha
    */

    /**
     * Constructor de la clase
     * 
     * @param personaje Personaje al que se le va asignar las imagenes
     */

    public GraficoPersonaje(Personaje personaje){
        cabeza = new Image[4];
        cuerpo = new Image[4];
        cola = new Image[4];
        curva = new Image[4];
        asignarSkin(personaje.getSkin());
    }

    public Image getCurva(int i){
        return curva[i];
    }
    
    public Image getCabeza(int i){
        return cabeza[i];
    }
    
    public Image getCuerpo(int i){
        return cuerpo[i];
    }

    public Image getCola(int i){
        return cola[i];
    }

    /**
     * Llena todos los valores de la matriz con su respectiva imagen
     * 
     * @param choise Skin que eligio el jugador para su personaje
     * @version 1.0.2
     */
    public void asignarSkin(int choise){
        switch(choise){
            case 1:{
                cabeza[0] = ajustarImagen(new ImageIcon("GreenHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("GreenHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("GreenHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("GreenHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("GreenBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("GreenBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("GreenBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("GreenBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("GreenTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("GreenTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("GreenTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("GreenTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("GreenCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("GreenCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("GreenCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("GreenCurvaRIGHT-UP.png").getImage());
                break;
            }

            case 2:{
                cabeza[0] = ajustarImagen(new ImageIcon("PinkHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("PinkHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("PinkHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("PinkHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("PinkBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("PinkBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("PinkBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("PinkBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("PinkTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("PinkTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("PinkTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("PinkTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("PinkCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("PinkCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("PinkCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("PinkCurvaRIGHT-UP.png").getImage());
                break;
            }

            case 3:{
                cabeza[0] = ajustarImagen(new ImageIcon("YellowHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("YellowHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("YellowHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("YellowHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("YellowBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("YellowBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("YellowBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("YellowBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("YellowTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("YellowTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("YellowTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("YellowTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("YellowCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("YellowCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("YellowCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("YellowCurvaRIGHT-UP.png").getImage());
                break;
            }

            case 4:{
                cabeza[0] = ajustarImagen(new ImageIcon("BlueHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("BlueHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("BlueHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("BlueHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("BlueBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("BlueBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("BlueBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("BlueBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("BlueTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("BlueTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("BlueTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("BlueTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("BlueCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("BlueCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("BlueCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("BlueCurvaRIGHT-UP.png").getImage());
                break;
            }

            case 5:{
                cabeza[0] = ajustarImagen(new ImageIcon("EarthHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("EarthHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("EarthHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("EarthHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("EarthBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("EarthBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("EarthBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("EarthBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("EarthTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("EarthTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("EarthTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("EarthTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("EarthCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("EarthCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("EarthCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("EarthCurvaRIGHT-UP.png").getImage());
                break;
            }

            case 6:{
                cabeza[0] = ajustarImagen(new ImageIcon("GraduatedHeadUP.png").getImage());
                cabeza[1] = ajustarImagen(new ImageIcon("GraduatedHeadRIGHT.png").getImage());
                cabeza[2] = ajustarImagen(new ImageIcon("GraduatedHeadDOWN.png").getImage());
                cabeza[3] = ajustarImagen(new ImageIcon("GraduatedHeadLEFT.png").getImage());
                cuerpo[0] = ajustarImagen(new ImageIcon("GraduatedBodyUP.png").getImage());
                cuerpo[1] = ajustarImagen(new ImageIcon("GraduatedBodyRIGHT.png").getImage());
                cuerpo[2] = ajustarImagen(new ImageIcon("GraduatedBodyDOWN.png").getImage());
                cuerpo[3] = ajustarImagen(new ImageIcon("GraduatedBodyLEFT.png").getImage());
                cola[0] = ajustarImagen(new ImageIcon("GraduatedTailUP.png").getImage());
                cola[1] = ajustarImagen(new ImageIcon("GraduatedTailRIGHT.png").getImage());
                cola[2] = ajustarImagen(new ImageIcon("GraduatedTailDOWN.png").getImage());
                cola[3] = ajustarImagen(new ImageIcon("GraduatedTailLEFT.png").getImage());
                curva[0] = ajustarImagen(new ImageIcon("GraduatedCurvaLEFT-DOWN.png").getImage());
                curva[1] = ajustarImagen(new ImageIcon("GraduatedCurvaLEFT-UP.png").getImage());
                curva[2] = ajustarImagen(new ImageIcon("GraduatedCurvaRIGHT-DOWN.png").getImage());
                curva[3] = ajustarImagen(new ImageIcon("GraduatedCurvaRIGHT-UP.png").getImage());
                break;
            }
        }
    }
}
