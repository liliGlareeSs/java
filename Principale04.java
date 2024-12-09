package newfrist;
import java.util.Scanner;
public class Principale04 {
	public static void main(String[] args) {

		int nombreAnnees, i;
		double tauxInteret, capitalInitial, capitalFinal;
		
        Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel est le montant du capital à placer (en €) ? ");		
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capital va-t-il être placé ? ");
		nombreAnnees = clavier.nextInt();
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalInitial;

		for(i=1 ; i <= nombreAnnees; i++){
			capitalFinal = (1 + tauxInteret/100)*capitalFinal;}
		
		System.out.print("Les intérêts acquis au bout de "+ nombreAnnees + " an(s) sont de ");
		System.out.printf("%6.2f", capitalFinal - capitalInitial);  
		System.out.print(" €");	
		clavier.close();
	}
 
	
}