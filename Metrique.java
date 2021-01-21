public class Metrique extends Taille {
  public Metrique() {
    cpa = new CategorieAdulte();
    cpg = new SansSexe();
    setValeur("Taille : 12");
    setDesc("Exprimee en centimetre, metre, pied ou pouce.");
  }
  public void afficherTaille() {
    cpa.categoriser();
    cpg.afficherSexe();
  }
}