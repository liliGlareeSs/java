package newfrist;
import java.util.Scanner;
public class ex4part1 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir une année
        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();
        
        // Vérifier si l'année est bissextile
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
        
        scanner.close();

		// TODO Auto-generated method stub

	}

}
