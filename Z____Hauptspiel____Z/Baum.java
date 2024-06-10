public class Baum {
  private BinaryTree<Inhalt> baum;
  private BinaryTree<Inhalt> tmpbaum;
  public Baum () {
    BinaryTree b2 = new BinaryTree<Inhalt>(new Frage("kanscht fliegen?"),new BinaryTree<Inhalt>(new Tier("Tiger")),new BinaryTree<Inhalt>(new Tier("Adler")));
    BinaryTree b3 = new BinaryTree<Inhalt>(new Frage("kanscht fliegen?"),new BinaryTree<Inhalt>(new Tier("Hase")),new BinaryTree<Inhalt>(new Tier("Spatz")));
    baum= new BinaryTree<Inhalt>(new Frage("Vegetarier?"),b3,b2);
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
}
