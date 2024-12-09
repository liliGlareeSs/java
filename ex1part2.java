package newfrist;
import java.util.Scanner;
public class ex1part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de choisir une forme
        System.out.println("Choisissez une forme (1: Rectangle, 2: Cercle, 3: Triangle) : ");
        int choix = scanner.nextInt();
        
        switch (choix) {
            case 1:
                // Rectangle
                System.out.print("Entrez la longueur du rectangle : ");
                double longueur = scanner.nextDouble();
                
                System.out.print("Entrez la largeur du rectangle : ");
                double largeur = scanner.nextDouble();
                
                double aireRectangle = longueur * largeur;
                double perimetreRectangle = 2 * (longueur + largeur);
                
                System.out.println("L'aire du rectangle est : " + aireRectangle);
                System.out.println("Le périmètre du rectangle est : " + perimetreRectangle);
                break;
                
            case 2:
                // Cercle
                System.out.print("Entrez le rayon du cercle : ");
                double rayon = scanner.nextDouble();
                
                double aireCercle = Math.PI * rayon * rayon;
                double perimetreCercle = 2 * Math.PI * rayon;
                
                System.out.println("L'aire du cercle est : " + aireCercle);
                System.out.println("Le périmètre du cercle est : " + perimetreCercle);
                break;
                
            case 3:
                // Triangle
                System.out.print("Entrez la base du triangle : ");
                double base = scanner.nextDouble();
                
                System.out.print("Entrez la hauteur du triangle : ");
                double hauteur = scanner.nextDouble();
                
                double aireTriangle = (base * hauteur) / 2;
                
                System.out.println("L'aire du triangle est : " + aireTriangle);
                // Pas de calcul de périmètre pour un triangle sans connaître les côtés.
                break;
                
            default:
                System.out.println("Choix non valide.");
        }
        
        scanner.close();
    }


}
