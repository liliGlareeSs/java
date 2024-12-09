package newfrist;

public class Animal {
   
    private String nom;
    private int age;

    public void setNom(String nom) {this.nom = nom;}

    public void setAge(int age) {this.age = age;}

    public String getNom() {return nom;}

    public int getAge() {return age;}
    
    public void faireSon() { System.out.println("L'animal fait un son.");}
}
