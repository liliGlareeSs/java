package newfrist;
import java.util.ArrayList;
import java.util.Scanner;

public class EX8 {
	  public static void main(String[] args) {
 ArrayList<String> noms = new ArrayList<>();
 noms.add("GHIZO");
 noms.add("GIZO");
 noms.add("ZIZO");
 noms.add("LIZO");
 
   Scanner scanner = new Scanner(System.in);
 
    System.out.print("Entrez un nom : ");
    String nom = scanner.nextLine();
     if (noms.contains(nom)) {
            System.out.println(nom + " est présent dans la liste.");
        } else {
            System.out.println(nom + " n'est pas présent dans la liste.");
        }

        scanner.close();
    }
 
 
 
 
 
}
