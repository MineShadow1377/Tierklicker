

public class Tier extends Inhalt {
  
  
  // Anfang Attribute
  public String name;
  public String eigenschaften;
  public String bild;
  // Ende Attribute
  
  public Tier(String pTier){
    istfrage=false;
    name=pTier;
    }
  // Anfang Methoden
  public String getName() {
    return name;
  }

  public String getEigenschaften() {
    return eigenschaften;
  }
  public String getBild() {
    return bild;
  }

  // Ende Methoden
} // end of Tier

