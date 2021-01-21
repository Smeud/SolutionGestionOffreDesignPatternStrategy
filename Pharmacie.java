public class Pharmacie extends Offres {
  // Class constructor
  public Pharmacie() {
    cpm = new Gourdes();
    taille = new Volume();
    setTitre("**Le titre de l'offre: pharmaceutique**");
    setDescription("La description: peut-etre un medicament, un service ou produit de soin de beaute...");
    setPrix(50.35);
  }
}