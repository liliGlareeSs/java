package newfrist;
import java.util.Scanner;
public class EX3 {
	public static  void main (String []args) {
	 Scanner scanner = new Scanner(System.in); 
     System.out.print("Entrez un nombre : ");
     double nombre = scanner.nextDouble();

     if (nombre > 0) {
         System.out.println("Le nombre est positif.");
     } else if (nombre < 0) {
         System.out.println("Le nombre est négatif.");
     } else {
         System.out.println("Le nombre est zéro.");
     }

     
     scanner.close();
 }
}
