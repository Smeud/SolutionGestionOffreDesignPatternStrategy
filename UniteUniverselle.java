public class UniteUniverselle extends Taille {
  public UniteUniverselle() {
    cpa = new CategorieSansAge();
    cpg = new SansSexe();
    setValeur("Taille : Medium");
    setDesc("Exprimee en Small,Medium,Large,eXtraLarge,eXtraeXtraLarge.");
  }
  public void afficherTaille() {
    cpa.categoriser();
    cpg.afficherSexe();
  }
}