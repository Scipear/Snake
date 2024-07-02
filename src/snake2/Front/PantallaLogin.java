package snake2.Front;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaLogin extends Pantalla{
    private JPanel fondo;
    private JLabel textoUsuario;
    private JTextField cuadroUsuario;
    private JButton ingresarButton;
    private JLayeredPane multiPanel;

    public PantallaLogin(){
        fondo = new JPanel();
        textoUsuario = new JLabel();
        cuadroUsuario = new JTextField();
        ingresarButton = new JButton();
        multiPanel = new JLayeredPane();
        iniciarPaneles();
        setVisible(true);
    }

    public void iniciarPaneles(){
        fondo.setBackground(new Color(13, 13, 32));
        fondo.setBounds(0, 0, ancho, alto);

        textoUsuario.setFont(new Font("Rockwell Extra Bold", 0, 24));
        textoUsuario.setText("Usuario:");
        textoUsuario.setBounds(150, 300, 150, 30);

        cuadroUsuario.setBackground(new Color(0, 250, 255));
        cuadroUsuario.setFont(new Font("DialogInput", 0, 18));
        cuadroUsuario.setForeground(new Color(0, 0, 0));
        cuadroUsuario.setBounds(350, 300, 150, 30);
        
        multiPanel.setBounds(0, 0, ancho, alto);
        multiPanel.add(fondo, Integer.valueOf(0));
        multiPanel.add(textoUsuario, Integer.valueOf(1));
        multiPanel.add(cuadroUsuario, Integer.valueOf(1));

        iniciarBotones();
        add(multiPanel);
    }

    public void iniciarBotones(){
        ingresarButton.setFont(new Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        ingresarButton.setText("Ingresar");
        ingresarButton.setBounds(230, 400, 200, 50);

        multiPanel.add(ingresarButton, Integer.valueOf(1));
    }
}
