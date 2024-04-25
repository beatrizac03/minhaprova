import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class GUI {
     private JFrame frame = new JFrame("BBB");
     private JPanel panel = new JPanel();
     private JButton buttonVotar = new JButton("VOTAR");
     private JButton apurarVoto = new JButton("APURAR VOTOS");

     public GUI() {
         frame.setSize(500, 500);
         frame.setResizable(false);
         frame.setLayout(null);
         frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);

         configurarComponentes();

         frame.setVisible(true);
     }

     public void configurarComponentes() {
         panel.setSize(500, 500);

         buttonVotar.setPreferredSize(new Dimension(200, 30));
         apurarVoto.setPreferredSize(new Dimension(200, 30));

         panel.add(buttonVotar);
         panel.add(apurarVoto);

         buttonVotar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 votar();
             }
         });

         apurarVoto.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 apurar();
             }
         });

         frame.add(panel);

         ArrayList<Jogador> arrayJogadores = new ArrayList<Jogador>();
         arrayJogadores.add(new Jogador("Beatriz Reis"));
         arrayJogadores.add(new Jogador("Alane Dias"));
         arrayJogadores.add(new Jogador("Davi Brito"));
         arrayJogadores.add(new Jogador("Deniziane Ferreira"));
         arrayJogadores.add(new Jogador("Fernanda Bande"));
     }
     public void votar() {
         String jogadorEscolhido = JOptionPane.showInputDialog(null, "Escolha um jogador pra sair: ");


     }

     public void apurar() {

     }

    public static void main(String[] args) {
        new GUI();
    }
}
