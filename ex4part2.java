package newfrist;
import java.util.Scanner;
public class ex4part2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();
        
       
        System.out.print("Entrez un mois (1-12) : ");
        int mois = scanner.nextInt();
        
        
        boolean estBissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
        
        int jours = 0;
        
       
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            jours = 31;
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            jours = 30;
        } else if (mois == 2) {
           
            jours = estBissextile ? 29 : 28;
        } else {
            System.out.println("Mois invalide.");
            scanner.close();
            return;  
        }
        
      
        System.out.println("Le mois " + mois + " de l'année " + annee + " contient " + jours + " jours.");
        
        scanner.close();


	}

}
