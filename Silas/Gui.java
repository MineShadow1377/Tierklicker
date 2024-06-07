import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Gui extends JFrame {
  // Anfang Attribute
  private JTextArea Fragenanzeige = new JTextArea("");
    private JScrollPane FragenanzeigeScrollPane = new JScrollPane(Fragenanzeige);
  private JButton bNEIN = new JButton();
  private JButton bJA = new JButton();
  private JButton Richtig = new JButton();
  // Ende Attribute
  
  public Gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 276; 
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
    
    FragenanzeigeScrollPane.setBounds(30, 11, 200, 60);
    cp.add(FragenanzeigeScrollPane);
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
    Falsch.setBounds(157, 180, 75, 25);
    Falsch.setText("Falsch");
    Richtig.setBounds(36, 180, 75, 25);
    Richtig.setText("Richtig");
    Richtig.setMargin(new Insets(2, 2, 2, 2));
    Richtig.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Richtig_ActionPerformed(evt);
      }
    });
    cp.add(Richtig);
    jTextField1.setBounds(61, 214, 150, 20);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Gui();
  } 
  
  public void bNEIN_ActionPerformed(ActionEvent evt) {
    Baum.getRightTree();
    
  } 

  public void bJA_ActionPerformed(ActionEvent evt) {
    Baum.getRightTree();
    
  } 

  public void Richtig_ActionPerformed(ActionEvent evt) {
    Fragenanzeige=Baum.getContent().getName();
    
  } 

  // Ende Methoden
} // end of class Gui

