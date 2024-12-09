package newfrist;

public class per {
	
	String nom;
	int age;
	
	public per(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

	public void afficherDetails(){
		System.out.println("Nom: "+ nom +", Age: "+ age);
		
	}

}
