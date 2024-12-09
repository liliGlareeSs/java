package newfrist;
import java.util.Scanner;
public class EX4_ {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("entre un chiffre (1-7) pour un jour de la semaiane :");
		int jour = clavier.nextInt();
		switch(jour) {
		case 1:
		    System.out.println("lundi");
		 break;
		 
		case 2:
	    System.out.println("mardi");
	 break;
		case 3:
	    System.out.println("mercredi ");
	 break;
		case 4:
	    System.out.println("jeudi");
	 break;
		case 5:
	    System.out.println("vendredi");
	 break;
		case 6:
	    System.out.println("samedi");
	 break;
		case 7:
	    System.out.println("dimanche");
	 break;
	  
	 default:
		 System.out.println("chiffre invalide!! (1->7");
		  clavier.close();
		
		}
		
	}
}
