package snake2.Front;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PantallaPrincipal extends Pantalla{
    private JPanel fondo;
    private JLabel fondoImagen;
    private JLayeredPane multiPanel;
    private JButton playButton;
    private JButton howtoButton;
    private JButton connectButton;
    private JButton creditsButton;
    private JButton pointsButton;
    private boolean respuesta;

    public PantallaPrincipal(){
        super();
        multiPanel = new JLayeredPane();
        fondo = new JPanel();
        fondoImagen = new JLabel(new ImageIcon("Fondo_MenuPrincipal.jpeg"));
        playButton = new JButton();
        howtoButton = new JButton();
        connectButton = new JButton();
        creditsButton = new JButton();
        pointsButton = new JButton();
        respuesta = false;
        iniciarPaneles();
        add(multiPanel);
        setVisible(true);
    }

    public void iniciarPaneles(){
        fondoImagen.setBounds(0, 0, 800, 800);
        fondo.add(fondoImagen);        
        fondo.setBounds(0, -60, ancho, 800);

        multiPanel.setBounds(0, 0, ancho, alto);
        multiPanel.add(fondo, Integer.valueOf(0));
        iniciarBotones();        
    }

    public void iniciarBotones(){
        playButton.setBackground(new Color(145, 146, 228));
        playButton.setText("Jugar");
        playButton.setFont(new Font("Rockwell Extra Bold", 1, 18));
        playButton.setForeground(new Color(16, 16, 32));
        playButton.setBorder(null);
        playButton.setBounds(250, 420, 220, 50);
        playButton.setMargin(new Insets(0, 0, 0, 0));
        playButton.addActionListener(iniciarJuego);

        howtoButton.setBackground(new Color(145, 146, 228));
        howtoButton.setFont(new Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        howtoButton.setForeground(new Color(16, 16, 32));
        howtoButton.setText("Como Jugar");
        howtoButton.setBorder(null);
        howtoButton.setBounds(160, 480, 160, 50);

        connectButton.setBackground(new Color(237, 17, 101));
        connectButton.setFont(new Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        connectButton.setForeground(new Color(16, 16, 32));
        connectButton.setText("Conectarse");
        connectButton.setBorder(null);
        connectButton.setBounds(410, 480, 160, 50);

        creditsButton.setBackground(new Color(237, 17, 101));
        creditsButton.setFont(new Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        creditsButton.setForeground(new Color(16, 16, 32));
        creditsButton.setText("Creditos");
        creditsButton.setBorder(null);
        creditsButton.setBounds(245, 550, 120, 50);

        pointsButton.setBackground(new Color(145, 146, 228));
        pointsButton.setFont(new Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        pointsButton.setForeground(new Color(16, 16, 32));
        pointsButton.setText("Puntajes");
        pointsButton.setBorder(null);
        pointsButton.setBounds(370, 550, 120, 50);

        multiPanel.add(playButton, Integer.valueOf(1));
        multiPanel.add(howtoButton, Integer.valueOf(1));
        multiPanel.add(connectButton, Integer.valueOf(1));
        multiPanel.add(creditsButton, Integer.valueOf(1));
        multiPanel.add(pointsButton, Integer.valueOf(1));
    }

    public void setRespuesta(boolean respuesta){
        this.respuesta = respuesta;
    }

    public boolean getRespuesta(){
        return respuesta;
    }

    ActionListener iniciarJuego = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            respuesta = true;
            setVisible(false);
        }
    };
}