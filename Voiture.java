package newfrist;

public class Voiture {
    
    private String marque;
    private String modele;
    private String couleur;
    
    public Voiture(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur; }
    public void demarrer() {
        System.out.println("La voiture  de marque " + marque + " " + modele + " démarre.");}
    public void arreter() {
        System.out.println("La voiture de marque  " + marque + " " + modele + " s'arrête."); }
    public void afficherInfo() {
        System.out.println("Marque : " + marque + ", Modèle : " + modele + ", Couleur : " + couleur);
       }
}
