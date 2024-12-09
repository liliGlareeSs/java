package newfrist;
import java.util.Scanner;
public class EX5_ {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int[] nombres = new int[5];
		 System.out.println("Entrez 5 nombres entiers : ");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Nombre " + (i + 1) + " : ");
	            nombres[i] = scanner.nextInt();
	        } 
	        
	        System.out.println("Les nombres en ordre inverse sont : ");
	        for (int i = nombres.length - 1; i >= 0; i--) {
	            System.out.println(nombres[i]);
	        }
	        
	        scanner.close();


	}

}
