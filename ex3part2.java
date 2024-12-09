package newfrist;
import java.util.Scanner;

public class ex3part2 {

	public static void main(String[] args) {
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
        
        // Vérifier si le nombre est divisible par 3, 5 ou 7
        if (nombre % 3 == 0) {
            System.out.println("Le nombre " + nombre + " est divisible par 3.");
        } 
        if (nombre % 5 == 0) {
            System.out.println("Le nombre " + nombre + " est divisible par 5.");
        }
        if (nombre % 7 == 0) {
            System.out.println("Le nombre " + nombre + " est divisible par 7.");
        }
        
        // Si le nombre n'est pas divisible par 3, 5 ou 7
        if (nombre % 3 != 0 && nombre % 5 != 0 && nombre % 7 != 0) {
            System.out.println("Le nombre " + nombre + " n'est pas divisible par 3, 5 ou 7.");
        }
        
        scanner.close();
    }

		// TODO Auto-generated method stub

	}


