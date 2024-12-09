package newfrist;

public class EX12 {
	public static int[] trouverMaximum(int[] tableau) {

		int max = tableau[0];
		int pos=0;
		
	for (int i=0;i<tableau.length;i++) {
		if(tableau[i]>max) {
			max=tableau[i];
			pos=i;
		}
	} return new int [] {max, pos};}
	
	public static void main(String[] args) {
		int[] tableau = {34, 12, 78, 45, 89};
		int[]reslt = trouverMaximum(tableau);
		   System.out.println("La valeur maximale est " + reslt[0] + " et sa position est " + reslt[1]);
	}

}
