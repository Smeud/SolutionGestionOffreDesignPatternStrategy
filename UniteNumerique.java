public class UniteNumerique extends Taille {
  public UniteNumerique() {
    cpa = new CategorieAdulte();
    cpg = new PourFemme();
    setValeur("Taille : 32/32");
    setDesc("Exprimee en nombre de la forme 28/30 ou 40,41 etc...");
  }
  public void afficherTaille() {
    cpa.categoriser();
    cpg.afficherSexe();
  }
}