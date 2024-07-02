package snake2.Front;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PantallaLobby extends Pantalla{
    private JPanel fondo;
    private JLabel textoMapa;
    private JLabel textoPersonaje;
    private JLabel textoSkin;
    private JButton atrasButton;
    private JButton mapa1Button;
    private JButton mapa2Button;
    private JButton skinNaranjaButton;
    private JButton skinAzulButton;
    private JButton skinVerdeButton;
    private JButton skinRosaButton;
    private JButton iniciarButton;
    private JLayeredPane multiPanel;

    public PantallaLobby(){
        super();
        fondo = new JPanel();
        textoMapa = new JLabel();
        textoPersonaje = new JLabel();
        textoSkin = new JLabel();
        atrasButton = new JButton();
        mapa1Button = new JButton();
        mapa2Button = new JButton();
        iniciarButton = new JButton();
        skinNaranjaButton = new JButton(new ImageIcon(("YellowHeadLEFT.png")));
        skinAzulButton = new JButton(new ImageIcon(("BlueHeadLEFT.png")));
        skinVerdeButton = new JButton(new ImageIcon(("GreenHeadRIGHT.png")));
        skinRosaButton = new JButton(new ImageIcon(("PinkHeadRIGHT.png")));
        multiPanel = new JLayeredPane();
        iniciarPaneles();
        setVisible(true);
    }

    public void iniciarPaneles(){
        fondo.setBackground(new Color(13, 13, 32));
        fondo.setBounds(0, 0, ancho, alto);

        textoMapa.setFont(new Font("DialogInput", 1, 24));
        textoMapa.setForeground(new Color(230, 255, 79));
        textoMapa.setText("Seleccion de Mapa");
        textoMapa.setBounds(445, 150, 250, 30);

        textoPersonaje.setFont(new Font("DialogInput", 1, 24));
        textoPersonaje.setForeground(new Color(230, 255, 79));
        textoPersonaje.setText("Seleccion de Personaje");
        textoPersonaje.setBounds(20, 70, 350, 30);

        textoSkin.setFont(new Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        textoSkin.setForeground(new Color(230, 255, 79));
        textoSkin.setText("Elija una skin");
        textoSkin.setBounds(200, 160, 200, 30);

        multiPanel.setBounds(0, 0, ancho, alto);
        multiPanel.add(fondo, Integer.valueOf(0));
        multiPanel.add(textoMapa, Integer.valueOf(1));
        multiPanel.add(textoPersonaje, Integer.valueOf(1));
        multiPanel.add(textoSkin, Integer.valueOf(1));
        inicarBotones();
        add(multiPanel);
    }

    public void inicarBotones(){
        atrasButton.setBackground(new Color(54, 54, 133));
        atrasButton.setFont(new Font("DialogInput", 1, 14)); // NOI18N
        atrasButton.setForeground(new Color(237, 17, 101));
        atrasButton.setText("<- Atras");
        atrasButton.setBounds(20, 20, 100, 30);
        atrasButton.addActionListener(volver);

        mapa1Button.setBackground(new Color(237, 17, 101));
        mapa1Button.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        mapa1Button.setForeground(new Color(16, 16, 32));
        mapa1Button.setText("Mapa 1");
        mapa1Button.setBorder(null);
        mapa1Button.setBounds(560, 190, 125, 125);

        mapa2Button.setBackground(new Color(237, 17, 101));
        mapa2Button.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        mapa2Button.setForeground(new Color(16, 16, 32));
        mapa2Button.setText("Mapa 2");
        mapa2Button.setBorder(null);
        mapa2Button.setBounds(560, 335, 125, 125);

        skinNaranjaButton.setBackground(new Color(13, 13, 32));
        skinNaranjaButton.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        skinNaranjaButton.setForeground(new Color(16, 16, 32));
        skinNaranjaButton.setBorder(null);
        skinNaranjaButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        skinNaranjaButton.setBounds(250, 370, 250, 150);

        skinAzulButton.setBackground(new Color(13, 13, 32));
        skinAzulButton.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        skinAzulButton.setForeground(new Color(16, 16, 60));
        skinAzulButton.setBorder(null);
        skinAzulButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        skinAzulButton.setBounds(250, 200, 250, 150);

        skinVerdeButton.setBackground(new Color(13, 13, 32));
        skinVerdeButton.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        skinVerdeButton.setForeground(new Color(16, 16, 32));
        skinVerdeButton.setBorder(null);
        skinVerdeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        skinVerdeButton.setBounds(0, 180, 250, 150);

        skinRosaButton.setBackground(new Color(13, 13, 32));
        skinRosaButton.setFont(new Font("DialogInput", 0, 18)); // NOI18N
        skinRosaButton.setForeground(new Color(16, 16, 32));
        skinRosaButton.setBorder(null);
        skinRosaButton.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        skinRosaButton.setBounds(0, 350, 250, 150);

        iniciarButton.setBackground(new Color(126, 45, 253));
        iniciarButton.setFont(new Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        iniciarButton.setForeground(new Color(230, 255, 79));
        iniciarButton.setText("INICIAR");
        iniciarButton.setBorder(null);
        iniciarButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        iniciarButton.setBounds(200, 570, 320, 75);

        multiPanel.add(atrasButton, Integer.valueOf(1));
        multiPanel.add(mapa1Button, Integer.valueOf(1));
        multiPanel.add(mapa2Button, Integer.valueOf(1));
        multiPanel.add(skinNaranjaButton, Integer.valueOf(1));
        multiPanel.add(skinAzulButton, Integer.valueOf(1));
        multiPanel.add(skinVerdeButton, Integer.valueOf(1));
        multiPanel.add(skinRosaButton, Integer.valueOf(1));
        multiPanel.add(iniciarButton, Integer.valueOf(1));
    }

    ActionListener volver = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            setVisible(false);
            new PantallaPrincipal();
        }
    };
}
