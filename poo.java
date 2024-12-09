package newfrist;
import java.util.Scanner;
public class poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Déclaration des variables
				int  diviseur;
				double dividende, quotient;
				
				// Enregistrement des valeurs tapées par l'utilisateur
				Scanner clavier = new Scanner(System.in);
				System.out.print("Entrer le dividende : ");
				dividende = clavier.nextDouble();
				System.out.print("Entrer le diviseur : ");
				diviseur = clavier.nextInt();
				
				// Calcul du quotient
				quotient = dividende / diviseur;
				
				// Affichage du résultat dans la console
				System.out.print("le quotient de la division est " + quotient);
				clavier.close();

	}

}
