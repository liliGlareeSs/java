package newfrist;

public class Livre {
    String titre, auteur;
    double prix;
   public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix; }
    public void afficherDetails() {
        System.out.println(" Ce livre est de Titre : " + titre + ", Auteur : " + auteur + ", Prix : " + prix +" DH");
    }
}
