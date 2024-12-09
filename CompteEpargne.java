package newfrist;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret; 
 
    public double calculInterets() {
        return getSolde() * (tauxInteret / 100);
    }

    public void appliquerInterets() {
        double interets = calculInterets();
        setSolde(getSolde() + interets);
        System.out.println("Intérêts ajoutés : " + interets + " DH");
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
}







