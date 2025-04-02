package swingTest;

import javax.swing.*;
import java.awt.event.*;

public class TestSwing extends JFrame {

   public TestSwing() {

     super("titre de l'application");

      WindowListener l = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
           System.exit(0);
         }
      };
     addWindowListener(l);

     JButton bouton = new JButton("Mon bouton");
     JPanel panneau = new JPanel();
     panneau.add(bouton);

     setContentPane(panneau);
     setSize(200,100);
     setVisible(true);

    bouton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           String input = JOptionPane.showInputDialog(null, "Entrez quelque chose :");
           if (input != null) {
              JOptionPane.showMessageDialog(null, "Vous avez saisi : " + input);
           }
        }
    });
   }

   public static void main(String [] args){
      JFrame frame = new TestSwing();
   }
}