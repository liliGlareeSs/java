package newfrist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur la longueur et la largeur
        System.out.print("Entrez la longueur du rectangle : ");
        double longueur = scanner.nextDouble();
        
        System.out.print("Entrez la largeur du rectangle : ");
        double largeur = scanner.nextDouble();
        
        // Calcul de l'aire et du périmètre
        double aire = longueur * largeur;
        double perimetre = 2 * (longueur + largeur);
        
        // Affichage des résultats
        System.out.println("L'aire du rectangle est : " + aire);
        System.out.println("Le périmètre du rectangle est : " + perimetre);
        
        scanner.close();
    }
}
