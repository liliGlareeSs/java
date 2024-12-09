package newfrist;

public class EX10 {
	public static double calculerPuissance(double base, int exp) {
        double resultat = 1;
        for (int i = 0; i < exp; i++) {
            resultat *= base;
        }
        return resultat;
    }
	
	public static void main(String[] args) {
		 double base = 4;
	        int exp = 3;
	        double resultat = calculerPuissance(base, exp);
	        System.out.println(base + " élevé à la puissance " + exp + " est : " + resultat);
    
	}

}
