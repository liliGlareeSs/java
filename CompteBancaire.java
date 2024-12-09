package newfrist;

public class CompteBancaire {
  
    private double solde;
    private String titulaire;

    public void afficherDetails() {
        System.out.println("Titulaire : " + titulaire + ", Solde : " + solde + " DH");
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }
}

