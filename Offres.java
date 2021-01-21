// Packages
import java.text.NumberFormat;

public abstract class Offres {
  // Class interface properties
  ComportementMonetaire cpm;
  // Composition relation between Taille and Offres classes
  Taille taille;
  
  // Class properties
  private String titre;
  private String description;
  private double prix;

  // Getters and setters
  public String getTitre() {
    return titre;
  }
  public String getDescription() {
    return description;
  }
  public double getPrix() {
    return prix;
  }
  protected void setTitre(String titre) {
    this.titre = titre;
  }
  protected void setDescription(String description) {
    this.description = description;
  }
  protected void setPrix(double prix) {
    this.prix = prix;
  }
  
  // Other method...
  public void afficherDevise() {
    cpm.afficherDevise();
  }
  
  public String toString() {
    NumberFormat format = NumberFormat.getInstance();format.setMinimumFractionDigits(2);
    return "\n"+getTitre()+"\n"+getDescription()+"\n"+taille+"\n"+"Le prix d'achat : "+format.format(getPrix());
  }

}