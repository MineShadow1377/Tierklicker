public class Baum {
  private BinaryTree<Inhalt> baum;
  private BinaryTree<Inhalt> tmpbaum;
  public Baum () {
    BinaryTree b2 = new BinaryTree<Inhalt>(new Frage("kanscht fliegen?"),new BinaryTree<Inhalt>(new Tier("Tiger")),new BinaryTree<Inhalt>(new Tier("Adler")));
    BinaryTree b3 = new BinaryTree<Inhalt>(new Frage("kanscht fliegen?"),new BinaryTree<Inhalt>(new Tier("Hase")),new BinaryTree<Inhalt>(new Tier("Spatz")));
    baum= new BinaryTree<Inhalt>(new Frage("Vegetarier?"),b2,b3);
  }
  public void neu(){
    tmpbaum=baum;
  }
  public void ja(){
    tmpbaum=tmpbaum.getRightTree();
  }
  
  public void nein(){
    tmpbaum=tmpbaum.getLeftTree();
  }
  
  public String getWort(){
    if (tmpbaum.getContent().istFrage() == true){
      Frage f = (Frage)tmpbaum.getContent();
      return f.getFrage();
    }
    else{
      Tier t = (Tier)tmpbaum.getContent();
      return t.getName();
    }
  }
  
  public void insert(String frage,String tier){
    Tier t =(Tier)tmpbaum.getContent();
    BinaryTree b1 = new BinaryTree<Inhalt>(new Frage(frage),new BinaryTree<Inhalt>(new Tier(tier)),new BinaryTree<Inhalt>(new Tier(t.getName())));
    suchen(t,baum,b1);
  }
  
  private void suchen(Tier b,BinaryTree<Inhalt> pbaum,BinaryTree<Inhalt> teilbaum){
    if(!pbaum.isEmpty()){
      String tName=b.getName();
      if(pbaum.getLeftTree().getContent().istFrage()){
        suchen(b,pbaum.getLeftTree(),teilbaum);
      }
      if(pbaum.getRightTree().getContent().istFrage()){
        suchen(b,pbaum.getRightTree(),teilbaum);
      }
      
      if(!pbaum.getLeftTree().getContent().istFrage()){
        Tier t = (Tier) pbaum.getLeftTree().getContent();
        if(tName.compareTo(t.getName())==0){
          pbaum.setLeftTree(teilbaum);     
        }
      }
      
      if(!pbaum.getRightTree().getContent().istFrage()){
        Tier t = (Tier) pbaum.getRightTree().getContent();
        if(tName.compareTo(t.getName())==0){
          pbaum.setRightTree(teilbaum);     
        }
      }
    }   
  }
}
