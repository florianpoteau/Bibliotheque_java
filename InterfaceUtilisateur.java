package Livre.Bibliotheque_java;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceUtilisateur {

	public static void main(String[] args) {
		
		/**
		 * @param Interface Utilisateur
		 */
		
		JFrame frame = new JFrame("Bienvenue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        

        JLabel jLabel1 =new JLabel("Livre : ");
        jLabel1.setDisplayedMnemonic('n');
        jLabel1.setBackground(Color.red);
        
//        Livre disponible
        
        JButton bouton = new JButton("Le java de jean michel Doudoux");
        JButton bouton1 = new JButton("Le combat d'un homme");
        JButton bouton2 = new JButton ("Clip de rap");
        JButton bouton3 = new JButton ("Le meilleur des meilleur");
        JButton bouton4 = new JButton ("Harry Pother");
        
        InterfaceUtilisateur button = new InterfaceUtilisateur();
        
//        Pannel
        
        JPanel pannel = new JPanel();
        pannel.add(jLabel1);
        pannel.add(bouton);
        pannel.add(bouton1);
        pannel.add(bouton2);
        pannel.add(bouton3);
        pannel.add(bouton4);

        frame.getContentPane().add(pannel);
        frame.setVisible(true);

	}
}
