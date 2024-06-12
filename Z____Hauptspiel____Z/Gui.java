import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Gui extends JFrame {
  // Anfang Attribute
  private JButton bNEIN = new JButton();
  private JButton bJA = new JButton();
  private JButton Bestaetigen = new JButton();
  private JButton bNeustart = new JButton();
  private Baum spiel = new Baum();
  private JLabel textfeld = new JLabel();
  private JButton Falsch = new JButton();
  private JTextField frage = new JTextField();
  private JTextField tier = new JTextField();
  private JLabel lFrage = new JLabel();
  private JLabel Hinweis2 = new JLabel();
  // Ende Attribute
  
  public Gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 431; 
    int frameHeight = 416;
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
    
    bNEIN.setBounds(220, 90, 171, 57);
    bNEIN.setText("NEIN");
    bNEIN.setMargin(new Insets(2, 2, 2, 2));
    bNEIN.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNEIN_ActionPerformed(evt);
      }
    });
    cp.add(bNEIN);
    bJA.setBounds(34, 89, 171, 57);
    bJA.setText("JA");
    bJA.setMargin(new Insets(2, 2, 2, 2));
    bJA.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bJA_ActionPerformed(evt);
      }
    });
    cp.add(bJA);
    Bestaetigen.setBounds(188, 316, 75, 25);
    Bestaetigen.setText("bestätigen");
    Bestaetigen.setMargin(new Insets(2, 2, 2, 2));
    Bestaetigen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Bestaetigen_ActionPerformed(evt);
      }
    });
    cp.add(Bestaetigen);
    bNeustart.setBounds(133, 152, 155, 49);
    bNeustart.setText("neustart");
    bNeustart.setMargin(new Insets(2, 2, 2, 2));
    bNeustart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNeustart_ActionPerformed(evt);
      }
    });
    cp.add(bNeustart);
    textfeld.setBounds(32, 18, 358, 68);
    textfeld.setText("...");
    cp.add(textfeld);
    Falsch.setBounds(177, 207, 75, 25);
    Falsch.setText("Falsch");
    Falsch.setMargin(new Insets(2, 2, 2, 2));
    Falsch.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Falsch_ActionPerformed(evt);
      }
    });
    cp.add(Falsch);
    frage.setBounds(141, 253, 150, 20);
    cp.add(frage);
    tier.setBounds(144, 282, 150, 20);
    cp.add(tier);
    lFrage.setBounds(92, 255, 46, 20);
    lFrage.setText("Frage");
    cp.add(lFrage);
    Hinweis2.setBounds(101, 282, 30, 20);
    Hinweis2.setText("Tier");
    cp.add(Hinweis2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Gui();
  } 
  
  public void bNEIN_ActionPerformed(ActionEvent evt) {
    spiel.nein();
    textfeld.setText(spiel.getWort());
  } 

  public void bJA_ActionPerformed(ActionEvent evt) {
    spiel.ja();
    textfeld.setText(spiel.getWort());
  } 

  public void Bestaetigen_ActionPerformed(ActionEvent evt) {
    spiel.insert(frage.getText(),tier.getText());
    
  } 

  public void bNeustart_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
     spiel.neu();
    textfeld.setText(spiel.getWort());
    
  } // end of bNeustart_ActionPerformed

  public void Falsch_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of Falsch_ActionPerformed

  // Ende Methoden
} // end of class Gui

