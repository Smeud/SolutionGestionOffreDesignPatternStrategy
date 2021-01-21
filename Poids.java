public class Poids extends Taille {
  public Poids() {
    cpa = new CategorieSansAge();
    cpg = new SansSexe();
    setValeur("Poids : 2kg");
    setDesc("Taille exprimee en kilogramme ou en gramme.");
  }
  public void afficherTaille() {
    cpa.categoriser();
    cpg.afficherSexe();
  }
}