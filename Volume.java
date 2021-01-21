public class Volume extends Taille {
  public Volume() {
    cpa = new CategorieSansAge();
    cpg = new SansSexe();
    setValeur("Volume : 5.6 l");
    setDesc("Exprimee en litre.");
  }
  public void afficherTaille() {
    cpa.categoriser();
    cpg.afficherSexe();
  }
}