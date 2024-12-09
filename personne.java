package newfrist;

public class personne {

	    private String nom;
	    private int age;
	    
	    public personne(String nom, int age) {
			this.nom = nom;
			this.age = age; }
		public String getNom() { return nom; }
	    public int getAge() { return age; }

	    public void setNom(String nom) { this.nom = nom; }
}
