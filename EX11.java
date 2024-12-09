package newfrist;

public class EX11 {
	public static boolean estNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;}
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;}
            }
        return true;}
	
	 public static void main(String[] args) {
	        int n1 = 7;
	        int n2 = 12;
	        System.out.println(n1 + " est premier ? " + estNombrePremier(n1));
	        System.out.println(n2 + " est premier ? " + estNombrePremier(n2));
	 }
}
