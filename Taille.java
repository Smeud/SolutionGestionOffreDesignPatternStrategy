public abstract class Taille {
  // Interface properties
  ComportementAge cpa;
  ComportementGenre cpg;
  // Classs properties
  private String valeur;
  private String desc;

  // Getters and setters
  public String getValeur() {
    return valeur;
  }
  public String getDesc() {
    return desc;
  }
  protected void setValeur(String valeur) {
    this.valeur = valeur;
  }
  protected void setDesc(String desc) {
    this.desc = desc;
  }
  
  // Other method
  public abstract void afficherTaille();

  public String toString() {
    return getDesc()+" "+getValeur();
  }
}