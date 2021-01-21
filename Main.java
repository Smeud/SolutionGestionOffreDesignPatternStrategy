class Main {
  public static void main(String[] args) {
    Offres of = new Alimentaires();
    System.out.println(of);
    of.afficherDevise();
    Taille tp= new Poids();
    tp.afficherTaille();

    Offres of2 = new Electroniques();
    System.out.println(of2);
    of2.afficherDevise();
    Taille tp1= new Poids();
    tp1.afficherTaille();

    Offres of3 = new Electromenagers();
    System.out.println(of3);
    of3.afficherDevise();
    Taille tv= new Volume();
    tv.afficherTaille();

    Offres of4 = new Pharmacie();
    System.out.println(of4);
    of4.afficherDevise();
    Taille tv1= new Volume();
    tv1.afficherTaille();

    Offres of5 = new Restauration();
    System.out.println(of5);
    of5.afficherDevise();
    Taille tu= new UniteUniverselle();
    tu.afficherTaille();

    Offres of6 = new Vetements();
    System.out.println(of6);
    of6.afficherDevise();
    Taille tn= new UniteNumerique();
    tn.afficherTaille();
  }
}