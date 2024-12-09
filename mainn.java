package newfrist;
import java.util.Scanner;
public class mainn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();
        int resultat = nombre * 2;
        System.out.println("Le résultat est : " + resultat);
        scanner.close();
	}

}
