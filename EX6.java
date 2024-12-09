package newfrist;
import java.util.Scanner;
public class EX6 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  int[] nombres = new int[5];
		  
		  System.out.println("Entrez 5 nombres entiers : ");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Nombre " + (i + 1) + " : ");
	            nombres[i] = scanner.nextInt();
	        }
	        
	        for (int i = 0; i < nombres.length / 2; i++) {
	            int temp = nombres[i];
	            nombres[i] = nombres[nombres.length - 1 - i];
	            nombres[nombres.length - 1 - i] = temp;
	        }
	        
	        System.out.println("Tableau inversé : ");
	        for (int nombre : nombres) {
	            System.out.println(nombre);
	        }
		  
	        scanner.close();


	}

}
