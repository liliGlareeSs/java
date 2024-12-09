package newfrist;
import java.util.ArrayList;

public class EX7 {

	public static void main(String[] args) {
		
		   
	ArrayList<Integer> nombres = new ArrayList<>();
	  for (int i = 1; i <= 10; i++) {
            nombres.add(i);
        }
	
	System.out.println("Éléments de la liste :");
       
	 for (int nombre : nombres) {
            System.out.println(nombre);
        }
	}
	

}
