public class Vetements extends Offres {
  // Class constructor
  public Vetements() {
    cpm = new Dollars();
    taille = new UniteNumerique();
    setTitre("**Le titre de l'offre: vetements et chaussures**");
    setDescription("La description: peut-etre un article de pret-a-porter, de vetements et de chaussures hommes ou femmes.");
    setPrix(90.10);
  }
}