public class Alimentaires extends Offres {
  // Class constructor
  public Alimentaires() {
    cpm = new Gourdes();
    taille = new Poids(); 
    setTitre("**Le titre de l'offre: alimentaire**");
    setDescription("La description: le produit est un produit commestible avec une date d'expiration...");
    setPrix(5.50);
  }
}