package newfrist;

public class Chat extends Animal {
    @Override
    public void faireSon() {
       System.out.println(getNom() + ", âgé de " + getAge() + " ans, miaule.");
    }
}
