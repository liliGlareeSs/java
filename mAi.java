package newfrist;

public class mAi {
	
	    public static void main(String[] args) {
	        
	        CompteEpargne compte = new CompteEpargne();

	        compte.setTitulaire("Yasso");
	        compte.setSolde(560000.0);
	        compte.setTauxInteret(3.5);

	        System.out.println("Avant calcul des intérêts :");
	        compte.afficherDetails();

	        compte.appliquerInterets();

	        System.out.println("Après calcul des intérêts :");
	        compte.afficherDetails();
	    }


	    }


