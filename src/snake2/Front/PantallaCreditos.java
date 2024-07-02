package snake2.Front;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class PantallaCreditos extends Pantalla{
    private JPanel fondo;
    private JLabel fondoImagen;
    private JButton atrasButton;

    public PantallaCreditos(){
        super();
        fondo = new JPanel();
        fondoImagen = new JLabel(new ImageIcon("Fondo_Creditos.jpeg"));
        atrasButton = new JButton();
        iniciarPaneles();
        setVisible(true);
    }

    public void iniciarPaneles(){
        fondoImagen.setBounds(0, -20, ancho, alto);
        fondo.setBounds(0, 0, ancho, alto);
        fondo.add(fondoImagen);
        fondo.setLayout(null);
        iniciarBotones();
        add(fondo);        
    }

    public void iniciarBotones(){
        atrasButton.setBackground(new Color(6, 55, 152));
        atrasButton.setFont(new Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        atrasButton.setForeground(new Color(252, 5, 203));
        atrasButton.setText("<- atras");
        atrasButton.setBounds(20, 20, 100, 30);
        atrasButton.addActionListener(volver);

        fondo.add(atrasButton);
    }
    
    ActionListener volver = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            setVisible(false);
            new PantallaPrincipal();
        }
    };
}
