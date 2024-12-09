package newfrist;

public class Chien extends Animal {
    @Override
    public void faireSon() {
        System.out.println(getNom() + ", âgé de " + getAge() + " ans, aboie.");
    }
}
