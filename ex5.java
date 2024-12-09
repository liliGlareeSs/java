package newfrist;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de choisir une opération
        System.out.println("Choisissez une opération : +, -, *, /");
        char operation = scanner.next().charAt(0);
        
        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();
        
        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();
        
        // Variable pour stocker le résultat
        double resultat = 0;
        
        // Effectuer l'opération choisie
        if (operation == '+') {
            resultat = nombre1 + nombre2;
        } else if (operation == '-') {
            resultat = nombre1 - nombre2;
        } else if (operation == '*') {
            resultat = nombre1 * nombre2;
        } else if (operation == '/') {
            // Vérifier si le deuxième nombre est zéro
            if (nombre2 == 0) {
                System.out.println("Erreur : Division par zéro !");
                scanner.close();
                return; // Quitter le programme si la division par zéro est tentée
            } else {
                resultat = nombre1 / nombre2;
            }
        } else {
            System.out.println("Opération non valide.");
            scanner.close();
            return; // Quitter le programme si l'opération est invalide
        }
        
        // Afficher le résultat
        System.out.println("Le résultat est : " + resultat);
        
        scanner.close();

	}

}
