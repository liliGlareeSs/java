package newfrist;
import java.util.Scanner;

public class ex3part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        
        // Vérifier si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Le nombre " + nombre + " est pair.");
        } else {
            System.out.println("Le nombre " + nombre + " est impair.");
        }
        
        scanner.close();
    }

	

}
