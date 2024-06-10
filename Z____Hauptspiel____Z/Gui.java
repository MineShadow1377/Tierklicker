import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Gui extends JFrame {
  // Anfang Attribute
  private JButton bNEIN = new JButton();
  private JButton bJA = new JButton();
  private JButton Richtig = new JButton();
  private JButton bNeustart = new JButton();
  private Baum spiel = new Baum();
  private JLabel l = new JLabel();
  private JButton Falsch = new JButton();
  // Ende Attribute
  
  public Gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 271; 
    int frameHeight = 335;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Gui");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bNEIN.setBounds(156, 90, 75, 25);
    bNEIN.setText("NEIN");
    bNEIN.setMargin(new Insets(2, 2, 2, 2));
    bNEIN.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNEIN_ActionPerformed(evt);
      }
    });
    cp.add(bNEIN);
    bJA.setBounds(34, 89, 75, 25);
    bJA.setText("JA");
    bJA.setMargin(new Insets(2, 2, 2, 2));
    bJA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bJA_ActionPerformed(evt);
      }
    });
    cp.add(bJA);
    Richtig.setBounds(36, 180, 75, 25);
    Richtig.setText("Richtig");
    Richtig.setMargin(new Insets(2, 2, 2, 2));
    Richtig.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Richtig_ActionPerformed(evt);
      }
    });
    cp.add(Richtig);
    bNeustart.setBounds(101, 136, 75, 25);
    bNeustart.setText("neustart");
    bNeustart.setMargin(new Insets(2, 2, 2, 2));
    bNeustart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNeustart_ActionPerformed(evt);
      }
    });
    cp.add(bNeustart);
    l.setBounds(48, 18, 174, 68);
    l.setText("...");
    cp.add(l);
    Falsch.setBounds(161, 183, 75, 25);
    Falsch.setText("Falsch");
    Falsch.setMargin(new Insets(2, 2, 2, 2));
    Falsch.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Falsch_ActionPerformed(evt);
      }
    });
    cp.add(Falsch);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Gui();
  } 
  
  public void bNEIN_ActionPerformed(ActionEvent evt) {
    spiel.nein();
    
  } 

  public void bJA_ActionPerformed(ActionEvent evt) {
    spiel.ja();
    
  } 

  public void Richtig_ActionPerformed(ActionEvent evt) {
    Fragenanzeige=Baum.getContent().getName();
    
  } 

  public void bNeustart_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     spiel.neu();
    textfeld.setText(spiel.gibInhalt());
    
  } // end of bNeustart_ActionPerformed

  public void Falsch_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of Falsch_ActionPerformed

  // Ende Methoden
} // end of class Gui

